package io.quikcraft.validation.validators;

import io.quikcraft.validation.annotation.URL;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

/**
 * @author i1619kHz
 */
public class URLValidator implements ConstraintValidator<URL, String> {
    private static final Pattern URL_PATTERN = Pattern.compile("^https?://\\S+$");

    @Override
    public void initialize(URL constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && URL_PATTERN.matcher(value).matches();
    }
}