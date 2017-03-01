package com.test.myapplication;


import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Indigo on 2/28/17.
 */

public interface CharactersDataSource {

    @GET("people/")
    Observable<CharactersResponseModel> getCharacters();

}
