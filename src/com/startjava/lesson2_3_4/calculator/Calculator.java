package com.startjava.lesson2_3_4.calculator;

public class Calculator {
    
    private int a;
    private int b;
    private char mathSign;
    public String expression;

    public void splitting(String expression) {
        String[] aExpression = expression.split(" ");
        a = Integer.parseInt(aExpression[0]);
        b = Integer.parseInt(aExpression[2]);
        mathSign = aExpression[1].charAt(0);
    }

    public int calculate() {
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