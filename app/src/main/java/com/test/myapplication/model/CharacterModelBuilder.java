package com.test.myapplication.model;

import java.util.List;

/**
 * Created by Indigo on 3/30/17.
 */

public class CharacterModelBuilder {

    private String name;
    private String height;
    private String mass;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private String birthYear;
    private String gender;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> vehicles;
    private List<String> starships;
    private String created;
    private String edited;
    private String url;


    public CharacterModelBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CharacterModelBuilder setHeight(String height) {
        this.height = height;
        return this;
    }

    public CharacterModelBuilder setMass(String mass) {
        this.mass = mass;
        return this;
    }

    public CharacterModelBuilder setHairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public CharacterModelBuilder setSkinColor(String skinColor) {
        this.skinColor = skinColor;
        return this;
    }

    public CharacterModelBuilder setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        return this;
    }

    public CharacterModelBuilder setBirthYear(String birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public CharacterModelBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public CharacterModelBuilder setHomeworld(String homeworld) {
        this.homeworld = homeworld;
        return this;
    }

    public CharacterModelBuilder setFilms(List<String> films) {
        this.films = films;
        return this;
    }

    public CharacterModelBuilder setSpecies(List<String> species) {
        this.species = species;
        return this;
    }

    public CharacterModelBuilder setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    public CharacterModelBuilder setStarships(List<String> starships) {
        this.starships = starships;
        return this;
    }

    public CharacterModelBuilder setCreated(String created) {
        this.created = created;
        return this;
    }

    public CharacterModelBuilder setEdited(String edited) {
        this.edited = edited;
        return this;
    }

    public CharacterModelBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public CharacterModel build() {
        return new CharacterModel(
            this.name,
            this.height,
            this.mass,
            this.hairColor,
            this.skinColor,
            this.eyeColor,
            this.birthYear,
            this.gender,
            this.homeworld,
            this.films,
            this.species,
            this.vehicles,
            this.starships,
            this.created,
            this.edited,
            this.url
        );

    }
}
