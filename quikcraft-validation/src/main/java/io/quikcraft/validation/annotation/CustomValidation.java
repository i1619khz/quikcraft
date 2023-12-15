package io.quikcraft.validation.annotation;

import io.quikcraft.validation.CustomValidator;
import io.quikcraft.validation.validators.CustomValidationValidator;
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
@Constraint(validatedBy = CustomValidationValidator.class)
public @interface CustomValidation {
    String message() default "Custom validation failed";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    Class<? extends CustomValidator> validator();
}
