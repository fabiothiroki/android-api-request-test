package com.test.myapplication;

/**
 * Created by Indigo on 3/5/17.
 */

public interface MainContract {

    interface View {

        void onFetchDataStarted();

        void onFetchDataCompleted();

        void onFetchDataSuccess(CharactersResponseModel charactersResponseModel);

        void onFetchDataError();
    }

    interface Presenter {

        void loadData();

        void subscribe();

        void unsubscribe();

        void onDestroy();

    }
}
