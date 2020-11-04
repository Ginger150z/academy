package by.academy.classwork.lesson1;

public class Task_4 {
	public static void main(String ...args){
		int a1 = 2;
		int b1 = 1;
		while (Math.pow(a1, b1) <= 1_000_000) {
			System.out.println(Math.pow (a1, b1));
			b1++;
		}
	}

}
