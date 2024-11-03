package Tasks.Lesson_2.Task_1;

public class Operation extends Input{

    private double a, b;
    private String sign;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Operation(double a, double b, String sign) {
        this.a = a;
        this.b = b;
        this.sign = sign;
    }

    public Operation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void calculateResult() {
        switch (sign) {
            case "+" -> sum();
            case "-" -> difference();
            case "*" -> multiply();
            case "/" -> divide();
            case "//" -> intDivision();
            case "%" -> remDivision();
            case "^" -> power();
        }
    }


    public void sum() {
        Additional add = new Additional(a, b);
        System.out.println(add.getSum());
    }

    private void difference() {
        Difference diff = new Difference(a, b);
        System.out.println(diff.getDifference());
    }

    private void multiply() {
        Multiplier multi = new Multiplier(a, b);
        System.out.println(multi.getMultiply());
    }

    private void divide() {
        Divider divide = new Divider(a, b);
        System.out.println(divide.getDivide());
    }

    private void intDivision() {
        IntDivision intDiv = new IntDivision(a, b);
        System.out.println(intDiv.getIntDiv());
    }

    private void remDivision() {
        RemDivision rem = new RemDivision(a, b);
        System.out.println(rem.getRemDivision());
    }

    private void power() {
        Power pow = new Power(a, b);
        double result = pow.getPower();

        if (Double.isNaN(result)) {
            System.out.println("Результат не является вещественным числом");
        } else {
            System.out.println(result);
        }
    }
}
