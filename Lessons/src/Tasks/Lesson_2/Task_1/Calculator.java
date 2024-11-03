package Tasks.Lesson_2.Task_1;

public class Calculator {


    public Calculator() {
    }

    public void menu() {
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

    public void calculate() {
        Input input = new Input();
        input.input();
    }

}
