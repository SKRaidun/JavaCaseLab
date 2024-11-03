package Tasks.Lesson_2.Task_1;

public class Divider extends Operation{

    public Divider(double a, double b) {
        super(a, b);
    }


    public double getDivide() {
        return getA() / getB();
    }
}
