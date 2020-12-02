package by.academy.classwork.lesson1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp8 {
	public static void main(String[] args) {

		String text = "cabcab testccaby yvdcccab tccabuu";
			
			Pattern pattern = Pattern.compile("[a-z].+c.+b.[a-z]");
	        Matcher matcher = pattern.matcher(text);
	        boolean b = matcher.matches();
	        System.out.println(b);
		}
	}

