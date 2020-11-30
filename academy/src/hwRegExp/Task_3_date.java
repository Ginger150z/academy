package hwRegExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;

public class Task_3_date {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
		
		Pattern pattern = Pattern.compile("\\d\\d[/-]\\d\\d[/-]\\d\\d\\d\\d");
        Matcher matcher = pattern.matcher(date);
        boolean b = matcher.matches();
        System.out.println(b);
	}

}
