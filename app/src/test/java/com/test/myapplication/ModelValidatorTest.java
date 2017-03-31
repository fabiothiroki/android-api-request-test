package com.test.myapplication;

import com.test.myapplication.model.CharacterModel;
import com.test.myapplication.model.CharacterModelBuilder;
import com.test.myapplication.model.validator.ModelValidator;

import org.junit.Test;

/**
 * Created by Indigo on 3/22/17.
 */

public class ModelValidatorTest {

    @Test()
    public void shouldNotThrowErrorOnValidCharacterModel() throws IllegalArgumentException {
        CharacterModelBuilder builder = new CharacterModelBuilder();
        builder.setName("Han Solo");

        CharacterModel characterModel = builder.build();

        ModelValidator validator = new ModelValidator(characterModel);
        validator.validate();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowErrorOnInvalidCharacterModel() throws IllegalArgumentException {
        CharacterModelBuilder builder = new CharacterModelBuilder();
        builder.setName(null);

        CharacterModel characterModel = builder.build();

        ModelValidator validator = new ModelValidator(characterModel);
        validator.validate();
    }
}
