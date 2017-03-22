package com.test.myapplication;

import com.test.myapplication.model.CharacterModel;
import com.test.myapplication.model.validator.ModelValidator;

import org.junit.Test;

/**
 * Created by Indigo on 3/22/17.
 */

public class ModelValidatorTest {

    @Test
    public void shouldNotThrowErrorOnValidCharacterModel() throws IllegalArgumentException {
        CharacterModel characterModel = new CharacterModel(
            "name",
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        ModelValidator validator = new ModelValidator(characterModel);
        validator.validate();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotThrowErrorOnInvalidCharacterModel() throws IllegalArgumentException {
        CharacterModel characterModel = new CharacterModel(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
        );

        ModelValidator validator = new ModelValidator(characterModel);
        validator.validate();
    }


}
