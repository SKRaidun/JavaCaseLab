package Tasks.Lesson_3.Task;

final class SportCar extends Car implements Moveable {

    public SportCar(Color color, String model, String manufactureYear, double weight, double maxSpeed, String transmissionType, String brand, String engineType, double volume, double horsePower, String bodyType, int doorsNumber, int wheelNumber) {
        super(color, model, manufactureYear, weight, maxSpeed, transmissionType, brand, engineType, volume, horsePower, bodyType, doorsNumber, wheelNumber);
    }

    @Override
    public void move() {
        System.out.println("Sport car is moving...");
    }

    @Override
    public void turn() {
        System.out.println("Sport car is turning...");
    }
}
