package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       final byte MONTHS_IN_YEAR = 12;
       final byte PERCENT = 100;

       Scanner scanner = new Scanner(System.in);

       System.out.print("Principal: ");
       int principal = scanner.nextInt();

       System.out.print("Annual Interest Rate: ");
       float monthlyInterestRate = (scanner.nextFloat())/ PERCENT / MONTHS_IN_YEAR;

       System.out.print("Period(Years): ");
       byte years = scanner.nextByte();
       int numberOfPayments = years * MONTHS_IN_YEAR;

       double numerator = monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), numberOfPayments));
       double denominator = Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1;
       double mortgage = principal * (numerator / denominator);

       String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
       System.out.println("Mortgage: " + mortgageFormatted);
   }
}