import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
	    while (true) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Введите первое число:");
	        int numb1 = scanner.nextInt();
	        System.out.println("Введите знак математической операции:");
	        char operator = scanner.next().charAt(0);
	        System.out.println("Введите второе число число:");
	        int numb2 = scanner.nextInt();
	        System.out.println("Результат: ");
	        int value = Calculator.calc(numb1, numb2, operator);
	        System.out.println(value);
	        System.out.println("Хотите продолжить вычисления? [yes/no]:");
	        String answer = scanner.next();
	        if (answer.equals("no")) {
	            break;
	        }
	    }
	}
}