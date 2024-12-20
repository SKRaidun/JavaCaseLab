package Tasks.Lesson_3.Task;

final class Jeep extends Car implements Moveable {

    public Jeep(Color color, String model, int manufactureYear, double weight, double maxSpeed, String transmissionType, String brand, String engineType, double volume, double horsePower, String bodyType, int doorsNumber, int wheelNumber) {
        super(color, model, manufactureYear, weight, maxSpeed, transmissionType, brand, engineType, volume, horsePower, bodyType, doorsNumber, wheelNumber);
    }

    public Jeep() {}
    @Override
    public void move() {
        System.out.println("Jeep is moving...");
    }

    @Override
    public void turn() {
        System.out.println("Jeep is turning...");
    }
}
