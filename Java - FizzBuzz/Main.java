package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        byte number = scanner.nextByte();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("buzz");
        } else if (number % 3 == 0) {
            System.out.println("fizz");
        } else {
            System.out.println(number);
        }
    }
}