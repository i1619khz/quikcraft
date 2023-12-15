package io.quikcraft.validation.validators;

import io.quikcraft.validation.CustomValidator;
import io.quikcraft.validation.annotation.CustomValidation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author i1619kHz
 */
public class CustomValidationValidator implements ConstraintValidator<CustomValidation, String> {

    private Class<? extends CustomValidator> validatorClass;

    @Override
    public void initialize(CustomValidation constraintAnnotation) {
        validatorClass = constraintAnnotation.validator();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // 允许空值，如果不允许，请根据实际需求进行调整
        }

        try {
            CustomValidator customValidator = validatorClass.getDeclaredConstructor().newInstance();
            return customValidator.isValid(value);
        } catch (Exception e) {
            // 异常处理，根据实际情况进行调整
            e.printStackTrace();
            return false;
        }
    }
}
