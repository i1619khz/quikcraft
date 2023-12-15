package io.quikcraft.validation.validators;

import io.quikcraft.validation.annotation.BankCardNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

/**
 * @author i1619kHz
 */
public class BankCardNumberValidator implements ConstraintValidator<BankCardNumber, String> {
    private static final Pattern BANK_CARD_PATTERN = Pattern.compile("^\\d{16,19}$");

    @Override
    public void initialize(BankCardNumber constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && BANK_CARD_PATTERN.matcher(value).matches();
    }
}
