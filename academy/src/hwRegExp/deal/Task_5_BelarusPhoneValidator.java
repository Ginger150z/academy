package hwRegExp.deal;

public class Task_5_BelarusPhoneValidator implements Task5_Validator {
    public boolean isValid (String phoneNumber) {
        if(phoneNumber.startsWith("+375")) {
            return true;
        } else {
            return false;
        }
    }
}
