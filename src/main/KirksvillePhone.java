package main;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = KirksvillePhoneConstraintValidator.class)
@Target(value= {ElementType.FIELD, ElementType.METHOD} ) // applicable to method/field
@Retention(RetentionPolicy.RUNTIME) // retain it as bytecode
public @interface KirksvillePhone {
	
	public String value() default "660";
	// define default error message
	public String message() default "Must be a valid Kirksville Phone number";
	// define default groups, for grouping related constraints
	public Class<?>[] groups() default {};
	// define default payloads, provide custom details about validation failure (severity, threat, error code…)
	public Class<? extends Payload>[] payload() default {};
}
