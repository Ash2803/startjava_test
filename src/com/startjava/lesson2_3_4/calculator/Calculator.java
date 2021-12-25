package com.startjava.lesson2_3_4.calculator;

public class Calculator {

    public int calculate(String expression) {
        String[] arrExpression = expression.split(" ");
        int a = Integer.parseInt(arrExpression[0]);
        int b = Integer.parseInt(arrExpression[2]);
        char mathSign = arrExpression[1].charAt(0);

        switch(mathSign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '/':
                return a / b;
            case '*':
                return a * b;
            case '%':
                return a % b;
            case '^':
                return (int) Math.pow(a, b);
            default:
                return 0;
        }
    }
}