package com.startjava.lesson2_3.calculator;

public class Calculator {
    
    private int a;
    private int b;
    private char sign;

    public int getA() {
      return a;
    }
    
    public void setA(int a) {
       this.a = a;
    }

    public int getB() {
      return b;
    }
    
    public void setB(int a) {
       this.b = a;
    }

    public char getSign() {
      return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public double calculate() {
        switch(sign) {
            case '+':
                return a + b;
            case '-' :
                return a - b;
            case '/' :
                return a / b;
            case '*' :
                return a * b;
            case '%' :
                return a % b;
            case '^' :
                return Math.pow(a, b);
            default :
                return 0;
        }
    }
}