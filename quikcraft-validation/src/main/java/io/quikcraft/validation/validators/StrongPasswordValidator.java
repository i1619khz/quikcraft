package io.quikcraft.validation.validators;

import io.quikcraft.validation.annotation.StrongPassword;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author i1619kHz
 */
public class StrongPasswordValidator implements ConstraintValidator<StrongPassword, String> {
    private int minLength;
    private int maxLength;

    @Override
    public void initialize(StrongPassword constraintAnnotation) {
        this.minLength = constraintAnnotation.minLength();
        this.maxLength = constraintAnnotation.maxLength();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // 允许空密码
        }

        // 密码至少包含一个大写字母、一个小写字母、一个数字和一个特殊字符
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsDigit = false;
        boolean containsSpecialChar = false;

        for (char c : value.toCharArray()) {
            if (Character.isUpperCase(c)) {
                containsUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                containsLowerCase = true;
            } else if (Character.isDigit(c)) {
                containsDigit = true;
            } else {
                containsSpecialChar = true;
            }
        }

        return containsUpperCase && containsLowerCase && containsDigit && containsSpecialChar &&
            value.length() >= minLength && value.length() <= maxLength;
    }
}
