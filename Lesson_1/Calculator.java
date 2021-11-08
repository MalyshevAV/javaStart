public class Calculator {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        char operator = '^';

        if (a > 0 && b > 0) {
            if (operator == '+') {
                System.out.println("a + b = " + (a + b));
            } else if (operator == '/') {
                System.out.println("a / b = " + (a / b));
            } else if (operator == '*') {
                System.out.println("a * b = " + (a * b));
            } else if (operator == '-') {
                System.out.println("a - b = " + (a - b));
            } else if (operator == '%') {
                System.out.println("a % b = " + (a % b));
            } else if (operator == '^') {
                int result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
                System.out.println("a ^ " + b + " = " + result);
            }
            } else {
                System.out.println("Введены неверные значания");
        }
    }
}
