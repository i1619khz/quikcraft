package io.quikcraft.validation.annotation;

import io.quikcraft.validation.validators.ValidValuesValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

/**
 * @author i1619kHz
 */
@Documented
@Constraint(validatedBy = ValidValuesValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidValues {
    String message() default "Invalid value. Must be one of {values}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int[] values() default {};
}
