package Tasks.Lesson_2.Task_1;

public class Additional extends Operation{

    public Additional(double a, double b) {
        super(a, b);
    }

    public double getSum() {
        return getA() + getB();
    }
}
