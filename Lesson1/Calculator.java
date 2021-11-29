public class Calculator {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
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
        } for (int i = 1; i <= 1024; i *= 2) {
			System.out.println(i * a);
		}
    }
}
