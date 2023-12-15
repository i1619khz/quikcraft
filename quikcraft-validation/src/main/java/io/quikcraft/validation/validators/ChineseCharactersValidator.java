package io.quikcraft.validation.validators;

import io.quikcraft.validation.annotation.ChineseCharacters;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

/**
 * @author i1619kHz
 */
public class ChineseCharactersValidator implements ConstraintValidator<ChineseCharacters, String> {
    private static final Pattern CHINESE_CHARACTERS_PATTERN = Pattern.compile("^[\u4E00-\u9FA5]+$");

    @Override
    public void initialize(ChineseCharacters constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && CHINESE_CHARACTERS_PATTERN.matcher(value).matches();
    }
}
