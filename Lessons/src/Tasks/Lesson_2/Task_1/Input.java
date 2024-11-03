package Tasks.Lesson_2.Task_1;

import java.util.Scanner;

public class Input extends Calculator {


    public void input() {

        Scanner scn = new Scanner(System.in);

        String line = "";

        while (true) {

            line = scn.nextLine();
            String[] symbols = line.split(" ");

            if (line.equals("exit")) { // Проверка на exit
                break;
            }

            Validator valid = new Validator(symbols);

            if (!valid.validate()) {
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

            String sign = symbols[1];

            Operation op = new Operation(a, b, sign);

            if ((sign.equals("/") || sign.equals("//") || sign.equals("%")) && b == 0) {
                System.out.println("Ошибка - деление на 0"); // Проверка деления на 0
                continue;
            }

            op.calculateResult();
        }
    }
}
