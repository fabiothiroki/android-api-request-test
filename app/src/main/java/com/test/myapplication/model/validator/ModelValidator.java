package com.test.myapplication.model.validator;

import android.support.annotation.NonNull;

import java.lang.reflect.Field;
import java.util.List;

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

        final Field[] modelFields = model.getClass().getFields();

        for (Field modelField : modelFields) {

            modelField.setAccessible(true);

            if (!modelField.isAnnotationPresent(IsDefined.class)) {
                continue;
            }

            try {
                Object modelAttribute = modelField.get(model);

                if (modelAttribute == null) {
                    throw new IllegalArgumentException(modelField + " is required");

                } else if (modelAttribute instanceof List) {
                    validateItemsFromListAttribute((List)modelAttribute);

                } else if (!(modelAttribute instanceof Boolean)) {
                    validateInnerAttribte(modelAttribute);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }

    private void validateItemsFromListAttribute(@NonNull final List attributes) throws IllegalArgumentException{
        for (Object objectFromList : attributes) {
            ModelValidator itemListValidator = new ModelValidator(objectFromList);
            itemListValidator.validate();
        }
    }

    private void validateInnerAttribte(@NonNull final Object innerAttribute) throws IllegalArgumentException {
        ModelValidator innerAttributeValidator = new ModelValidator(innerAttribute);
        innerAttributeValidator.validate();
    }

}
