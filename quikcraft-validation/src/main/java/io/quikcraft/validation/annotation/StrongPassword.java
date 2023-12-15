package io.quikcraft.validation.annotation;

import io.quikcraft.validation.validators.StrongPasswordValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author i1619kHz
 */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StrongPasswordValidator.class)
public @interface StrongPassword {
    String message() default "Invalid password";

    int minLength() default 8; // 最小长度

    int maxLength() default 20; // 最大长度

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
