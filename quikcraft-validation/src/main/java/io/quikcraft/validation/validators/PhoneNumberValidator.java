package io.quikcraft.validation.validators;

import io.quikcraft.validation.annotation.PhoneNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

/**
 * @author i1619kHz
 */
public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^\\d{11}$");

    @Override
    public void initialize(PhoneNumber constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && PHONE_NUMBER_PATTERN.matcher(value).matches();
    }
}

