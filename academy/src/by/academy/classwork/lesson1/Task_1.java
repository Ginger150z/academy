package by.academy.classwork.lesson1;
import java.util.Scanner;

import java.io.IOException;

public class Task_1 {
	 public static void main(String[] args) throws IOException {
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 int a = scanner.nextInt();
		 int age = scanner.nextInt();
		 
		 
		
		 if (a < 100) {
		 int x = a - (a * 5 / 100);
	        System.out.println(x);
		 }
		 if (a >= 100 && a  < 200) {
			 int y = a - (a * 7 / 100);
		        System.out.println(y);
	    }
		 if (a >= 200 && a  < 300) {
		        if (age > 18) {
		        	int z1 = a - (a * 16 / 100);
		        	System.out.println(z1);
		        } else {
		        	int z2 = a - (a * 9 / 100);
		        	System.out.println(z2);
		        }
	    }
		 if (a >= 300 && a  < 400) {
			 int n = a - (a * 15 / 100);
		        System.out.println(n);
	    }
		 if (a >= 400) {
			 int m = a - (a * 20 / 100);
		        System.out.println(m);
	    }
	}
}
