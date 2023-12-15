package io.quikcraft.validation.annotation;

import io.quikcraft.validation.validators.URLValidator;
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
@Constraint(validatedBy = URLValidator.class)
public @interface URL {
    String message() default "Invalid URL";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
