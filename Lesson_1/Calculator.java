public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        char operator = '/';
        int value = a * a;

        if (a > 0 && b > 0 && operator == '+') {
            System.out.println("a + b = " + (a + b));
        } else if (a > 0 && b > 0 && operator == '/') {
            System.out.println("a / b = " + (a / b));
        } else if (a > 0 && b > 0 && operator == '*') {
            System.out.println("a * b = " + (a * b));
        } else if (a > 0 && b > 0 && operator == '/') {
            System.out.println("a / b = " + (a / b));
        } else if (a > 0 && b > 0 && operator == '%') {
            System.out.println("a % b = " + (a % b));
        } else if (a > 0 && b > 0 && value != 0) {
            System.out.println("a^2 = " + value);
        } else {
            System.out.println("Введены неверные значания");
        }
    }
}
