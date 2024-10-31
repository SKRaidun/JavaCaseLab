package Tasks;

import java.util.Scanner;

public class Task2 {
    
    public static void menu() {
        System.out.println("Меню:");
        System.out.println("Сумма: +");
        System.out.println("Разность: -");
        System.out.println("Произведение: *");
        System.out.println("Отношение: /");
        System.out.println("Целочисленное деление: //");
        System.out.println("Деление с остатком: %");
        System.out.println("Возведение в степень: ^");
        System.out.println("Введите выражение в виде a + b:");
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double difference(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static int intDivision(double a, double b) {
        return (int) (a / b);
    }

    public static int remDivision(double a, double b) {
        return (int) (a % b);
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static boolean divideByZero(double b) {
        return b == 0;
    }
    public static boolean expressionCorrect(String[] line) {
        return line.length == 3;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String line = "";

        menu();

        while(true) {
            line = scn.nextLine();
            String[] symbols = line.split(" ");

            if (line.equals("exit")) { // Проверка на exit
                break;
            }
            if (!expressionCorrect(symbols)) { // Проверка на корректность выражения
                System.out.println("Неверное выражение. Введите еще раз:");
                continue;
            }

            double a, b;
            try {
                a = Double.parseDouble(symbols[0]);
                b = Double.parseDouble(symbols[2]);
            } catch (Exception e) {
                System.out.println("Значения должны быть числовыми"); //Проверка на числа
                continue;
            }
            String symb = symbols[1];

            //Реализация операций

            if (symb.equals("+")) {
                System.out.println(sum(a,b));
            } else if (symb.equals("-")) {
                System.out.println(difference(a,b));
            } else if (symb.equals("*")) {
                System.out.println(multiply(a,b));
            } else if (symb.equals("/")) {
                if (divideByZero(b)) {
                    System.out.println("Ошибка - деление на 0"); // Проверка деления на 0
                    continue;
                }
                System.out.println(divide(a, b));
            } else if (symb.equals("^")) {
                double pow = power(a, b);
                if (Double.isNaN(pow)) {
                    System.out.println("Результат не является вещественным числом");
                } else {
                    System.out.println(pow);
                }
            } else if (symb.equals("//")) {
                if (divideByZero(b)) {
                    System.out.println("Ошибка - деление на 0"); // Проверка деления на 0
                    continue;
                }
                System.out.println(intDivision(a, b));
            } else if (symb.equals("%")) {
                if (divideByZero(b)) {
                    System.out.println("Ошибка - деление на 0"); // Проверка деления на 0
                    continue;
                }
                System.out.println(remDivision(a, b));
            }

        }
    }
}
