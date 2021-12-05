import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calcOne = new Calculator();
        Scanner scanner = new Scanner(System.in);

        boolean right = true;
        while(right == true) {
            System.out.println("Enter the first number");
            calcOne.setA(scanner.nextInt());
            System.out.println("Enter the math sign");
            calcOne.setSign(scanner.next().charAt(0));
            System.out.println("Enter the second number");
            calcOne.setB(scanner.nextInt());
            System.out.println(calcOne.getResult());
            System.out.println("Do you want to continue? [Yes/No]:");
            String result = (scanner.next());

            if(result.equalsIgnoreCase("Yes")) {    
                System.out.println("Great! Let's get started.");
                right = true;
            } else if(result.equalsIgnoreCase("No")) {
                System.out.println("Goodbye!");
                right = false;
            } else if(!result.equalsIgnoreCase("No") && !result.equalsIgnoreCase("Yes")) {
                System.out.println("Do you want to continue? [Yes/No]:");
                result = (scanner.next());
            } 
        }
    }
}