package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        if (marks >= 75) {

            System.out.println("Result : Excellent");

        }
        else if (marks>=50 && marks<75) {

            System.out.println("Result : pass");

        }else {

            System.out.println("Result : Fail");

        }

        input.close();
    }
}