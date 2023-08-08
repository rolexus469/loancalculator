package com.JavaBootcamp.App;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class App {
    public static void main(String[] args) {
        System.out.println("Loan Calculator \n ");
        int amount = 100;
        int years = 5;
        double interestRate = 10.0;

        try {
            printInputs(amount, years, interestRate);
            printResult(new LoanCalculator(amount, years, interestRate).calculateRepaymentAmount());
        } catch (LoanCalculatorException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void printResult(double currentAmountPayable) {
        NumberFormat formatter = new DecimalFormat("0.00");
        System.out.println("Total Amount Due: " + formatter.format(currentAmountPayable));
    }



    private static void printInputs(int amount, int years, double interestRate) {
        System.out.println("Initial Loan amount : $" + amount);
        System.out.println("Number of years     : " + years);
        System.out.println("Interest rate       : " + interestRate + "%");

    }
}
