package Tasks.Lesson_2.Task_1;

public class IntDivision extends Operation{

    public IntDivision(double a, double b) {
        super(a, b);
    }

    public int getIntDiv() {
        return (int) (getA() / getB());
    }
}
