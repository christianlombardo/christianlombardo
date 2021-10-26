package Revature.Class6.Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

// Written and Created by Christian Lombardo

/*
    # Create a calculator app ----------------------------
        Enter First Number : Enter Second Number:
        Select Option: 1 - Add 2 - Subtract 3 - Multiple 4 - Divide
        Result: _______
*/

public class Calculator {

    private int add (int a, int b) {
        return a + b;
    }
    private int subtract (int a, int b) {
        return a - b;
    }
    private int multiple (int a, int b) {
        return a * b;
    }
    private int divide (int a, int b) {
        return a / b;
    }

    public int performOperation(int operation, int number1, int number2)  throws ArithmeticException {
        int result = 0;
        switch (operation) {
            case 1:
                result = this.add(number1,number2);
                break;
            case 2:
                result = this.subtract(number1,number2);
                break;
            case 3:
                result = this.multiple(number1, number2);
                break;
            case 4:
                try {
                    result = this.divide(number1, number2);
                }
                catch (ArithmeticException e) {
                    System.out.println(e);
                }
                catch (Exception e){
                    System.out.println(e);
                }
                break;
        }

        return result;
    }

    public static void main(String[] args) throws InputMismatchException {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator App!");
        System.out.println();

        int result = 0;
        int run = 1;
        int number1 = 0;
        int number2 = 0;
        int operation = 0;

        while (run != 0) {
            try {
                System.out.println("Enter two numbers");
                number1 = scanner.nextInt();
                number2 = scanner.nextInt();

                System.out.println("Select Option: 1 - Add, 2 - Subtract, 3 - Multiple, 4 - Divide");
                operation = scanner.nextInt();
                result = calculator.performOperation(operation, number1, number2);

                System.out.println("Result: " + result);
                System.out.println();

                System.out.println("1 to continue, 0 to exit");
                run = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter the correct data format.");
                break;  // TODO Create a way to have this while loop run continuously after the catch.
            }
        }

    }
}
