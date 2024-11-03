package Tasks.Lesson_2.Task_1;

public class Difference extends Operation {

    public Difference(double a, double b) {
        super(a, b);
    }

    public double getDifference() {
        return getA() - getB();
    }
}