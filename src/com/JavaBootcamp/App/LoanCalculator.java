package com.JavaBootcamp.App;

public class LoanCalculator {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public int getYears() {
        return years;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public LoanCalculator(int amount, int years, double interestRate) throws LoanCalculatorException {
        if (amount <= 0 || years <= 0 || interestRate <= 0) {
            throw new LoanCalculatorException("Invalid values - cannot calculate repayment amount");
        }

        this.amount = amount;
        this.years = years;
        this.interestRate = interestRate;
    }

    private int years;
    private double interestRate;

    public double calculateRepaymentAmount() {
        double interestRateMultiplier = 1 + (interestRate / 100);

        double currentAmountPayable = amount;
        int currentYear = 1;
        while (currentYear <= years) {
            currentAmountPayable = currentAmountPayable * interestRateMultiplier;
            currentYear++;
        }
        return currentAmountPayable;
    }












}
