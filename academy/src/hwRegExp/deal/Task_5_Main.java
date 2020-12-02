package hwRegExp.deal;

import hwRegExp.deal.Task_5_AmericanPhoneValidator;
import hwRegExp.deal.Task_5_BelarusPhoneValidator;
import hwRegExp.deal.Task_5_EmailValidator;

public class Task_5_Main {
	public static void main(String[] args) {
		Task_5_AmericanPhoneValidator americanValidator = new Task_5_AmericanPhoneValidator();
		Task_5_BelarusPhoneValidator belarusPhoneValidator = new Task_5_BelarusPhoneValidator();
		Task_5_EmailValidator emailValidator = new Task_5_EmailValidator();
		System.out.println(americanValidator.isValid("+1384930030"));
		System.out.println(belarusPhoneValidator.isValid("+375293621545"));
		System.out.println(emailValidator.isValid("katya.rasolka@inbox.ru"));
	}

}
