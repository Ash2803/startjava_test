public class Calculator {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int sum = a + b;
        int minus = a- b;
        int multiplicate = a * b;
        int division = a / b;
        int reminderOfDivision = a % b;
        int degree = a * a;
        char symbol1 = '+';
        char symbol2 = '-';
        char symbol3 = '*';
        char symbol4 = '/';
        char symbol5 = '%';
        char symbol6 = '^';

        if(symbol1 == '+') {
            System.out.println(sum);
        } if(symbol2 == '-') {
            System.out.println(minus);
        } if(symbol3 == '*') {
            System.out.println(multiplicate);
        } if(symbol4 == '/') {
            System.out.println(division);
        } if(symbol5 == '%') {
            System.out.println(reminderOfDivision);
        } if(symbol6 == '^') {
            System.out.println(degree);
        }
    }
}