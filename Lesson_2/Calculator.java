public class Calculator {

    public static int calc(int numb1, int numb2, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = numb1 + numb2;
                break;
            case '/':
                result = numb1 / numb2;
                break;
            case '*':
                result = numb1 * numb2;
                break;
            case '-':
                result = numb1 - numb2;
                break;
            case '%':
                result = numb1 % numb2;
                break;
            case '^':
                result = numb1;
                for (int i = 1; i < numb2; i++) {
                    result *= numb1;
                }
                break;
            default:
                System.out.println("Оператор введен неверно");
        }
        return result;
    }
}
