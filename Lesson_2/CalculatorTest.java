import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
	    while (true) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Введите первое число:");
	        int num1 = scanner.nextInt();
	        System.out.println("Введите знак математической операции:");
	        char operator = scanner.next().charAt(0);
	        System.out.println("Введите второе число число:");
	        int num2 = scanner.nextInt();
	        System.out.println("Результат: ");
	        int result = Calculator.calc(num1, operator, num2);
	        System.out.println(result);
            String answer="";
            while (!answer.equals("no") && !answer.equals("yes")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
	            answer = scanner.next();
            }
	        if (answer.equals("no")) {
	            break;
	        }
	    }
	}
}
