package io.quikcraft.validation.validators;

import io.quikcraft.validation.annotation.IDCard;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

/**
 * @author i1619kHz
 */
public class IDCardValidator implements ConstraintValidator<IDCard, String> {

    private static final Pattern ID_CARD_PATTERN = Pattern.compile("^\\d{18}$");

    @Override
    public void initialize(IDCard constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && ID_CARD_PATTERN.matcher(value).matches();
    }
}
