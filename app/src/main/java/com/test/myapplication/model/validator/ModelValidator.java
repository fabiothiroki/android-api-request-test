package com.test.myapplication.model.validator;

import android.support.annotation.NonNull;

import java.lang.reflect.Field;

/**
 * Created by Indigo on 3/22/17.
 */

public class ModelValidator {

    private Object model;

    public ModelValidator(@NonNull Object model)  {
        this.model = model;
    }

    public void validate() throws IllegalArgumentException {

        if (model == null) {
            throw new IllegalArgumentException("Model cannot be null");
        }

        final Field[] modelFields = model.getClass().getDeclaredFields();

        for (Field modelField : modelFields) {
            validateIsDefinedField(modelField);
        }
    }

    private void validateIsDefinedField(Field field) {

        if (field.isAnnotationPresent(IsDefined.class)) {

            Object attributeValue = null;
            field.setAccessible(true);

            try {
                attributeValue = field.get(model);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            if (attributeValue == null) {
                throw new IllegalArgumentException(field + " is required");
            }

        }
    }
}
