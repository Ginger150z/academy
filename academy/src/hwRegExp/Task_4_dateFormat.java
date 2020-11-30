package hwRegExp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Task_4_dateFormat {
		public static void main (String[] args) throws ParseException {
			 SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			 
			 Scanner scanner = new Scanner(System.in);
			 String inputDate = scanner.nextLine();
			 
			 Date date = dateFormat.parse(inputDate);
			 
			 SimpleDateFormat df = new SimpleDateFormat("yyyy");
			 
	        
			 System.out.println(date.getDate());
			 System.out.println(date.getMonth() + 1);
			 System.out.println(df.format(date));
	}

}
