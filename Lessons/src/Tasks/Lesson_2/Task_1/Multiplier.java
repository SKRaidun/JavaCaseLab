package Tasks.Lesson_2.Task_1;

public class Multiplier extends Operation{

    public Multiplier(double a, double b) {
        super(a, b);
    }

    public double getMultiply() {
        return getA() * getB();
    }
}
