package main;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class KirksvillePhoneConstraintValidator 
implements ConstraintValidator<KirksvillePhone, String> {

	private String numberPrefix;
	@Override
	public void initialize(KirksvillePhone phone)
	{
		numberPrefix = phone.value();
	}
	
	@Override
	public boolean isValid(String number,
	ConstraintValidatorContext theConstraintValidatorContext)
	{
		boolean result;
		
		if (number != null)
		{
			result = number.startsWith(numberPrefix);
		}
		else
		{
			result = true;
		}
		
		if (number.length() != 10) {
			
		}
		
		if (number.isEmpty()) {
			result = true;
		}
		
		return result;
	}
	

}
