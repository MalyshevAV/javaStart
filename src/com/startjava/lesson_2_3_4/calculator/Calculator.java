package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String expression) {
        String[] parts = expression.split(" ");
        int num1 = Integer.parseInt(parts[0]);
        char operator = parts[1].charAt(0);
        int num2 = Integer.parseInt(parts[2]);

        int result = 0;
        switch (operator) {
            case '+':
                return  num1 + num2;
            case '/':
                return num1 / num2;
            case '*':
                return num1 * num2;
            case '-':
                return num1 - num2;
            case '%':
                return num1 % num2;
            case '^':
                return (int) Math.pow(num1, num2);
            default:
                System.out.println("Оператор введен неверно");
        }
        return result;
    }
}
