package com.startjava.lesson_2_3.calculator;

import com.startjava.lesson_2_3.calculator.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("no")) {
            System.out.println("Введите математическое выражение :");
            String expression = scanner.nextLine();

            int result = Calculator.calculate(expression);
            System.out.println(expression + " = " + result);

            while (!answer.equals("no") && !answer.equals("yes")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            }
        }
    }
}

