package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Are you an intern? (true/false): ");
        boolean intern = input.nextBoolean();

        System.out.println();
        System.out.println("----- Student Details -----");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Intern : " + intern);
        input.close();
    }
}
