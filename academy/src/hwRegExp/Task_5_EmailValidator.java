package hwRegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_5_EmailValidator implements Task5_Validator{
	public boolean isValid (String email) {
		String emailN = "katya.rasolka@inbox.ru";
		Pattern pattern = Pattern.compile(".+[@]\\w+[.]\\w+");
        Matcher matcher = pattern.matcher(emailN);
        if (matcher.matches()) {
        	return true;
        }else {
        	return false;
        }
	}

}
