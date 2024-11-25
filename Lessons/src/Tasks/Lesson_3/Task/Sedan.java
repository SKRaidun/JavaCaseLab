package Tasks.Lesson_3.Task;

final class Sedan extends Car  {
    public Sedan(Color color, String model, int manufactureYear, double weight, double maxSpeed, String transmissionType, String brand, String engineType, double volume, double horsePower, String bodyType, int doorsNumber, int wheelNumber) {
        super(color, model, manufactureYear, weight, maxSpeed, transmissionType, brand, engineType, volume, horsePower, bodyType, doorsNumber, wheelNumber);
    }

    public Sedan() {
        super();
    }


    @Override
    public String toString() {
        return "Sedan " + super.toString();
    }
}
