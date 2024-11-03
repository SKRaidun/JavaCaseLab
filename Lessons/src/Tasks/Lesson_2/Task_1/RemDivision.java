package Tasks.Lesson_2.Task_1;

public class RemDivision extends Operation{

    public RemDivision(double a, double b) {
        super(a, b);
    }

    public int getRemDivision() {
        return (int) (getA() % getB());
    }
}
