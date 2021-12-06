import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calcOne = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String answer = "Yes";
        while(!"No".equalsIgnoreCase(answer)) {
            System.out.println("Enter the first number");
            calcOne.setA(scanner.nextInt());
            System.out.println("Enter the math sign");
            calcOne.setSign(scanner.next().charAt(0));
            System.out.println("Enter the second number");
            calcOne.setB(scanner.nextInt());
            System.out.println(calcOne.calculate());

            calcOne.calculate();

            do {
                System.out.println("Do you want to contiune? [Yes/No]");
                answer = scanner.next();
            } while (!"Yes".equalsIgnoreCase(answer) && !"No".equalsIgnoreCase(answer));
        }
    }
}