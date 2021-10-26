package Revature.Class7.Assignment;

// Q1: Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.



import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1 {

    public int areaRectangle(int h, int w) {
        return h * w;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Question1 q1 = new Question1();

        System.out.println("Welcome to the Rectangle Area App!");
        System.out.println();
        int result = 0;
        int run = 1;
        int w = 0;
        int h = 0;

        while (run != 0) {
            try {
                System.out.println("Enter the width and height of a rectangle numbers");
                h = scanner.nextInt();
                w = scanner.nextInt();

                result = q1.areaRectangle(h, w);

                System.out.println("Area of the Rectangle =3 " + result);
                System.out.println();

                System.out.println("1 to continue, 0 to exit");
                run = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter the correct data format.");
                break;  // TODO Create a way to have this while loop run continuously after the catch.
            }
        }
    }
}
