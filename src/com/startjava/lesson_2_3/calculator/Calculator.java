package com.startjava.lesson_2_3.calculator;

public class Calculator {

    public static int calc(int num1, char operator, int num2) {
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = num1;
                for (int i = 1; i < num2; i++) {
                    result *= num1;
                }
                break;
            default:
                System.out.println("Оператор введен неверно");
        }
        return result;
    }
}
