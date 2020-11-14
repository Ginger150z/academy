package by.academy.classwork.hw3;

import java.util.Scanner;

public class Task_3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String str1 = scanner.nextLine();
        if (str1.length() % 2 != 0) {
            System.out.println("The length of the string is not even");
            return;
        }

        String str2 = scanner.nextLine();
        if (str2.length() % 2 != 0) {
            System.out.println("The length of the string is not even");
            return;
        }

        String resultString = str1.substring(0, str1.length() / 2) +
                str2.substring(str2.length() / 2);

        System.out.println(resultString);
    }
}
