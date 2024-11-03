package Tasks.Lesson_2.Task_1;

public class Validator {

    private String[] line;

    public Validator(String[] line) {
        this.line = line;
    }

    private boolean expressionCorrect() {
        return line.length == 3;
    }

    public boolean validate() {

        if (!expressionCorrect()) { // Проверка на корректность выражения
            System.out.println("Неверное выражение. Введите еще раз:");
            return false;
        }
        return true;
    }

    public boolean divideByZero() {
        return Double.parseDouble(line[2]) == 0;
    }
}
