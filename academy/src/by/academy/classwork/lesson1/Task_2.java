package by.academy.classwork.lesson1;

import java.util.Scanner;

import java.io.IOException;

public class Task_2 {
	 public static void main(String[] args) throws IOException {
		 
		 Scanner scanner = new Scanner(System.in);
		
		String dataType = scanner.nextLine();
		String  userNumber = scanner.nextLine();
		 switch (dataType) {
			 case "int":
				 System.out.println (Integer.parseInt(userNumber) % 2);
				 break;
			 case "double":
				 System.out.println ((Double.parseDouble(userNumber) * 70) / 100);
				 break;
			 case "float":
				 System.out.println (Float.parseFloat(userNumber) * Float.parseFloat(userNumber));
				 break;
			 case "char":
				 System.out.println ((int) userNumber.charAt(0));
				 break;
			 case "String":
				 System.out.println("Hello " + userNumber);
				 break;
			default:
				System.out.println("Unsupported type");
				 break;
				
		 }
		 
	 }
}