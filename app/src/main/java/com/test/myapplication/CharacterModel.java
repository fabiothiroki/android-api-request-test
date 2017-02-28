package com.test.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Indigo on 2/28/17.
 */

public class CharacterModel {

    public final String name;
    public final String height;
    public final String mass;

    @SerializedName("hair_color")
    public final String hairColor;

    @SerializedName("skin_color")
    public final String skinColor;

    @SerializedName("eye_color")
    public final String eyeColor;

    @SerializedName("eye_color")
    public final String birthYear;

    public final String gender;
    public final String homeworld;
    public final List<String> films;
    public final List<String> species;
    public final List<String> vehicles;
    public final List<String> starships;
    public final String created;
    public final String edited;
    public final String url;
}
