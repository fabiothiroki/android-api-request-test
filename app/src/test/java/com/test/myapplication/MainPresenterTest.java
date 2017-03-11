package com.test.myapplication;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import rx.Observable;
import rx.schedulers.Schedulers;

import static org.mockito.Mockito.when;

/**
 * Created by Indigo on 3/9/17.
 */

public class MainPresenterTest {

    @Mock
    private CharactersDataSource charactersDataSource;

    @Mock
    private MainContract.View view;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void fetchValidDataShouldLoadIntoView() {

        CharactersResponseModel charactersResponseModel = new CharactersResponseModel(0, null, null, null);

        when(charactersDataSource.getCharacters())
            .thenReturn(Observable.just(charactersResponseModel));

        MainPresenter mainPresenter = new MainPresenter(
            this.charactersDataSource,
            Schedulers.immediate(),
            Schedulers.immediate(),
            this.view
        );

    }

}
