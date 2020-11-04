package by.academy.classwork.lesson1;

import java.util.Scanner;

import java.io.IOException;

public class Task_3 {
	 public static void main(String[] args) throws IOException {
		 
		 Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		if (a > 0 && a < 11) {
		for (int a1 = 1; a1 < 11; a1++) {
			System.out.println(a * a1);
		}
		} else {
			System.out.println ("Unsupported number");
		}
}
}