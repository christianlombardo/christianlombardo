package Class7.Assignment;


// Q3: Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.

import java.util.InputMismatchException;
import java.util.Scanner;

class Average {

    public double average (double num1, double num2, double num3) {
        return (num1 + num2 + num3)/3;
    }
}

public class Question3 {

    public static void main(String[] args) {
        Average average = new Average();
        Scanner scanner = new Scanner(System.in);

        double result = 0;
        int run = 1;
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;

        while (run != 0) {
            try {
                System.out.println("Enter three numbers:");
                num1 = scanner.nextDouble();
                num2 = scanner.nextInt();
                num3 = scanner.nextInt();

                result = average.average(num1, num2, num3);

                //System.out.println("The average of te three numbers you entered is  " + result);
                System.out.printf("The average of the three numbers you entered  %.2f\n", result);
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
