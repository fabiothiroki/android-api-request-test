package com.test.myapplication;

import java.util.List;

/**
 * Created by Indigo on 2/28/17.
 */

public class CharactersResponseModel {

    public final int count;
    public final String next;
    public final String previous;
    public final List<CharacterModel> results;

    public CharactersResponseModel(int count, String next, String previous, List<CharacterModel> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }
}
