package io.quikcraft.validation.annotation;

import io.quikcraft.validation.validators.IDCardValidator;
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
@Constraint(validatedBy = IDCardValidator.class)
public @interface IDCard {
    String message() default "Invalid ID card number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
