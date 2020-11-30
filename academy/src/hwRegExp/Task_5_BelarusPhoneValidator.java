package hwRegExp;

public class Task_5_BelarusPhoneValidator implements Task5_Validator {
	public boolean isValid (String phoneNumber) {
		phoneNumber.startsWith("+375");
		if(phoneNumber.startsWith("+375")) {
			return true;
		} else {
			return false;
		}
	}

}
