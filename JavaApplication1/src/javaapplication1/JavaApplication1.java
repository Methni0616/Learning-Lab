package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== STUDENT MENU =====");
        System.out.println("1. View Profile");
        System.out.println("2. View GPA");
        System.out.println("3. View Course");
        System.out.println("4. Exit");

        System.out.print("Select an option: ");
        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.println("===== STUDENT PROFILE =====");
                System.out.println("Name   : Methni");
                System.out.println("Age    : 23");
                System.out.println("Degree : BSc (Hons) in Software Engineering");
                break;

            case 2:
                System.out.println("Current GPA : 3.48");
                break;

            case 3:
                System.out.println("Current Course : BSc (Hons) in Software Engineering");
                break;

            case 4:
                System.out.println("Good Bye!");
                break;

            default:
                System.out.println("Invalid Option.");
        }

        input.close();
    }
}
