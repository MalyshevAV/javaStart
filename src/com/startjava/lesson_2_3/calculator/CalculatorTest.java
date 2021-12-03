package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("no")) {
            System.out.println("Введите первое число:");
            int num1 = scanner.nextInt();
            System.out.println("Введите знак математической операции:");
            char operator = scanner.next().charAt(0);
            System.out.println("Введите второе число число:");
            int num2 = scanner.nextInt();
            System.out.println("Результат: ");
            int result = Calculator.calc(num1, operator, num2);
            System.out.println(result);

            while (!answer.equals("no") && !answer.equals("yes")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            }
        }
    }
}