package Tasks.Lesson_3.Task;

final class Sedan extends Car implements Moveable {
    public Sedan(Color color, String model, String manufactureYear, double weight, double maxSpeed, String transmissionType, String brand, String engineType, double volume, double horsePower, String bodyType, int doorsNumber, int wheelNumber) {
        super(color, model, manufactureYear, weight, maxSpeed, transmissionType, brand, engineType, volume, horsePower, bodyType, doorsNumber, wheelNumber);
    }


    @Override
    public void move() {
        System.out.println("Sedan is moving...");
    }

    @Override
    public void turn() {
        System.out.println("Sedan is turning...");
    }
}
