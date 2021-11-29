public class Calculator {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        char sign = '^';

        if(sign == '+') {
            System.out.println(b + a);
        } if(sign == '-') {
            System.out.println(a - b);
        } if(sign == '*') {
            System.out.println(a * b);
        } if(sign == '/') {
            System.out.println(b / a);
        } if(sign == '%') {
            System.out.println(b % a);
        } if(sign == '^') {
            System.out.println(Math.pow(a,2));
            System.out.println(Math.pow(b,4));
        }
    }
}
