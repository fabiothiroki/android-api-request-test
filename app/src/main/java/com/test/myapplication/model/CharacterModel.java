package com.test.myapplication.model;

import com.google.gson.annotations.SerializedName;
import com.test.myapplication.model.validator.IsDefined;

import java.util.List;

/**
 * Created by Indigo on 2/28/17.
 */

public class CharacterModel {

    @IsDefined
    private final String name;
    private final String height;
    private final String mass;

    @SerializedName("hair_color")
    private final String hairColor;

    @SerializedName("skin_color")
    private final String skinColor;

    @SerializedName("eye_color")
    private final String eyeColor;

    @SerializedName("birth_year")
    private final String birthYear;

    private final String gender;
    private final String homeworld;
    private final List<String> films;
    private final List<String> species;
    private final List<String> vehicles;
    private final List<String> starships;
    private final String created;
    private final String edited;
    private final String url;

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

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public String getMass() {
        return mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public String getGender() {
        return gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public List<String> getFilms() {
        return films;
    }

    public List<String> getSpecies() {
        return species;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public List<String> getStarships() {
        return starships;
    }

    public String getCreated() {
        return created;
    }

    public String getEdited() {
        return edited;
    }

    public String getUrl() {
        return url;
    }
}
