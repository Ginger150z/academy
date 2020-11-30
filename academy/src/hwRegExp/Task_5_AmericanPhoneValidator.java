package hwRegExp;

public class Task_5_AmericanPhoneValidator implements Task5_Validator {
	public boolean isValid (String phoneNumber) {
		phoneNumber.startsWith("+1");
		if (phoneNumber.startsWith("+1")) {
			return true;
		} else {
			return false;
		}
	}
	
}
