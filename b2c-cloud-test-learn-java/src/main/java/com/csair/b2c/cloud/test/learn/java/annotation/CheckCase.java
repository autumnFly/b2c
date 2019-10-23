package com.csair.b2c.cloud.test.learn.java.annotation;

import com.csair.b2c.cloud.test.learn.java.enums.CaseMode;
import com.csair.b2c.cloud.test.learn.java.validator.CheckCaseValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckCaseValidator.class)
@Documented
public @interface CheckCase {
	String message() default "{com.csair.b2c.constraints.CheckCase.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	CaseMode value();
}
