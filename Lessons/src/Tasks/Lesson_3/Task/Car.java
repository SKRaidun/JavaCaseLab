package Tasks.Lesson_3.Task;


public sealed class Car extends Transport permits Sedan, Crossover, SportCar, Jeep  {

    private double maxSpeed;
    private String transmissionType;
    private String brand;

    public Car(Color color, String model, String manufactureYear, double weight, double maxSpeed, String transmissionType, String brand, String engineType, double volume, double horsePower, String bodyType, int doorsNumber, int wheelNumber) {
        super(TransportType.CAR, color, model, manufactureYear, weight);
        this.maxSpeed = maxSpeed;
        this.transmissionType = transmissionType;
        this.brand = brand;
        Engine engine = new Engine(engineType, volume, horsePower);
        Body body = new Body(bodyType, doorsNumber, wheelNumber);
    }



    public class Engine implements EngineActions {
        private String engineType;
        private double volume;
        private double horsePower;

        public Engine(String engineType, double volume, double horsePower) {
            this.engineType = engineType;
            this.volume = volume;
            this.horsePower = horsePower;
        }



        @Override
        public void StartEngine() {
            EngineActions.super.StartEngine();
        }

        @Override
        public void StopEngine() {
            EngineActions.super.StopEngine();
        }

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }

        public double getVolume() {
            return volume;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }

        public double getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(double horsePower) {
            this.horsePower = horsePower;
        }
    }

    public class Body implements DoorsActions {
        private String bodyType;
        private int doorsNumber;
        private int wheelNumber;

        public Body(String bodyType, int doorsNumber, int wheelNumber) {
            this.bodyType = bodyType;
            this.doorsNumber = doorsNumber;
            this.wheelNumber = wheelNumber;
        }

        @Override
        public void openDoor() {
            DoorsActions.super.openDoor();
        }

        @Override
        public void closeDoor() {
            DoorsActions.super.closeDoor();
        }

        public String getBodyType() {
            return bodyType;
        }

        public void setBodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public int getDoorsNumber() {
            return doorsNumber;
        }

        public void setDoorsNumber(int doorsNumber) {
            this.doorsNumber = doorsNumber;
        }

        public int getWheelNumber() {
            return wheelNumber;
        }

        public void setWheelNumber(int wheelNumber) {
            this.wheelNumber = wheelNumber;
        }
    }

    @Override
    public void turnLights() {
        System.out.println("Headlights on");
    }

    @Override
    public void offLights() {
        System.out.println("Headlights off");
    }
}
