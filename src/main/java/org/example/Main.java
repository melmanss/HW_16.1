package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Введіть перше число: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Введіть друге число: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Оберіть операцію: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = calculator.add(firstNumber, secondNumber);
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = calculator.subtract(firstNumber, secondNumber);
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = calculator.multiply(firstNumber, secondNumber);
                System.out.println("Результат: " + result);
                break;
            case '/':
                try {
                    result = calculator.divide(firstNumber, secondNumber);
                    System.out.println("Результат: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Неправильна операція.");
                break;
        }

        scanner.close();
    }
}
