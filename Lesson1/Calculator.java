public class Calculator {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        char sign = '^';

        if(sign == '+') {
            System.out.println(b + a);
        } else if(sign == '-') {
            System.out.println(a - b);
        } else if(sign == '*') {
            System.out.println(a * b);
        } else if(sign == '/') {
            System.out.println(b / a);
        } else if(sign == '%') {
            System.out.println(b % a);
        } else if(sign == '^') {
            int result = 1;
            for(int i = 1; i <= b; i++) {
                result *= a;
            }
            System.out.println(result);
        }
    }
}
