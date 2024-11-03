package Tasks.Lesson_2.Task_1;

public class Power extends Operation{

    public Power(double a, double b) {
        super(a, b);
    }

    public double getPower() {
        return Math.pow(getA(), getB());
    }
}
