package Revature.Class6.Assignment;

// Written and Created by Christian Lombardo

/*
    Exercise 2:
    Create an EMI Calculator app

    Input:
    Loan Amount
    Rate of Interest
    Tenure

    Output:
    EMI:__________

 */

// EMI = P × r × (1 + r)n/((1 + r)n - 1) where P= Loan amount, r= interest rate, n=tenure in number of months.
// https://economictimes.indiatimes.com/analysis/what-is-emi-and-how-is-it-calculated/articleshow/39880530.cms?utm_source=contentofinterest&utm_medium=text&utm_campaign=cppst
// https://en.wikipedia.org/wiki/Equated_monthly_installment

import java.util.Scanner;

public class EMICalculator {

    public double getEMI (double loanAmount, double interestRate, int tenureNumMonths) {
        double result=0;
        try {
            result = loanAmount * interestRate * Math.pow((1 + interestRate), tenureNumMonths) / (Math.pow((1 + interestRate), tenureNumMonths) - 1);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    public static void main(String[] args) {
        EMICalculator emi = new EMICalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Loan Calculator App!");
        System.out.println();

        double result = 0;
        int run = 1;
        double loanAmount;
        double interestRate;
        int tenureNumMonths;

        while (run != 0) {
            System.out.println("Enter Loan amount, interest rate (in decimal format), and tenure in number of months");
            loanAmount = scanner.nextDouble();
            interestRate = scanner.nextDouble();
            tenureNumMonths = scanner.nextInt();

            result = emi.getEMI(loanAmount, interestRate, tenureNumMonths);
            System.out.printf("Result: %.2f\n", result);
            System.out.println();
            System.out.println("1 to continue, 0 to exit");
            run = scanner.nextInt();
            System.out.println();
        }
    }
}
