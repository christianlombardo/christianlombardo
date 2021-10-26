package Class7.Assignment;

// Q2: Take name, roll number and field of interest from user and print in the format below : Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String interest = "1";
        try {
            System.out.println("Enter your name, ");
            String name = scanner.nextLine();

            System.out.println("Enter your roll number,");
            String rollNumber = scanner.nextLine();

            System.out.println("Enter your field of interests, press 0 to finish entering.");
            ArrayList<String> interests = new ArrayList<>();
            while (!interest.equalsIgnoreCase("0")) {
                interest = scanner.nextLine();
                if (!interest.equalsIgnoreCase("0")) {
                    interests.add(interest);
                }
            }

            System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interests are " + interests.toString() + ".");

        }
        catch (InputMismatchException e) {
            System.out.println("Please enter the correct data format.");
        }


    }
}
