package io.quikcraft.validation.validators;

import io.quikcraft.validation.annotation.ValidValues;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author i1619kHz
 */
public class ValidValuesValidator implements ConstraintValidator<ValidValues, Object> {

    private int[] validValues;

    @Override
    public void initialize(ValidValues constraintAnnotation) {
        this.validValues = constraintAnnotation.values();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null) {
            return false;
        }

        for (Object validValue : validValues) {
            if (value == validValue) {
                return true;
            }
        }

        return false;
    }
}
