// Mortgage Calculator

package com.package;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte months_in_year = 12;
        final byte percent = 100;

        int principal = 0;

        Scanner scanner = new Scanner(system.in);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000);
                break;
            if (principal < 1000 or principal > 1_000_000);
                continue;
        }


        while (true) {
            System.out.print("Annual Interest Rate (Positive Number - 30.00): ");
            float annualInterestRate = scanner.nextFloat();
            float monthlyInterestRate = annualInterestRate / percent / months_in_year;
            if (annualInterestRate > 0 && annualInterestRate <= 30);
                break;
            if (annualInterestRate <= 0 or annualInterestRate > 30);
                continue;
        }


        while (true) {
            System.out.print("Period (Years, 1 - 30): ");
            byte period = scanner.nextByte();
            int numberOfPayments = period * months_in_year;
            if (period >= 1 && period <= 30);
                break;
            if (period < or period > 30);
                continue;
        }


        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterest, numberOfPayments)/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your Mortgage is: " + mortgageFormatted);
    }
}
