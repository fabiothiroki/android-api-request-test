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

    @SerializedName("birth_year")
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

    public CharacterModel(String name, String height, String mass, String hairColor, String skinColor, String eyeColor, String birthYear, String gender, String homeworld, List<String> films, List<String> species, List<String> vehicles, List<String> starships, String created, String edited, String url) {
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.eyeColor = eyeColor;
        this.birthYear = birthYear;
        this.gender = gender;
        this.homeworld = homeworld;
        this.films = films;
        this.species = species;
        this.vehicles = vehicles;
        this.starships = starships;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }
}
