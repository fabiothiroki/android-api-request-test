package com.test.myapplication;

import android.support.annotation.NonNull;

import rx.Observer;
import rx.Scheduler;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Indigo on 3/5/17.
 */

public class MainPresenter implements MainContract.Presenter {

    @NonNull
    private CharactersDataSource charactersDataSource;

    @NonNull
    private Scheduler backgroundScheduler;

    @NonNull
    private Scheduler mainScheduler;

    @NonNull
    private CompositeSubscription subscriptions;

    private MainContract.View view;

    public MainPresenter(
        @NonNull CharactersDataSource charactersDataSource,
        @NonNull Scheduler backgroundScheduler,
        @NonNull Scheduler mainScheduler,
        MainContract.View view) {
        this.charactersDataSource = charactersDataSource;
        this.backgroundScheduler = backgroundScheduler;
        this.mainScheduler = mainScheduler;
        this.view = view;
        subscriptions = new CompositeSubscription();
    }



    @Override
    public void loadData() {
        view.onFetchDataStarted();
        subscriptions.clear();

        Subscription subscription = charactersDataSource
                .getCharacters()
                .subscribeOn(backgroundScheduler)
                .observeOn(mainScheduler)
                .subscribe(new Observer<CharactersResponseModel>() {
                    @Override
                    public void onCompleted() {
                        view.onFetchDataCompleted();
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.onFetchDataError(e);
                    }

                    @Override
                    public void onNext(CharactersResponseModel rootModel) {
                        view.onFetchDataSuccess(rootModel);
                    }
                });

        subscriptions.add(subscription);

    }

    @Override
    public void subscribe() {
        loadData();
    }

    @Override
    public void unsubscribe() {
        subscriptions.clear();
    }

    @Override
    public void onDestroy() {
        this.view = null;
    }
}
