package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String answer = "Yes";
        while(!"No".equalsIgnoreCase(answer)) {
            System.out.print("Enter the mathematical expression: ");
            System.out.println(calc.calculate(scanner.nextLine()));

            do {
                System.out.println("Do you want to contiune? [Yes/No]");
                answer = scanner.nextLine();
            } while (!"Yes".equalsIgnoreCase(answer) && !"No".equalsIgnoreCase(answer));
        }
    }
}

