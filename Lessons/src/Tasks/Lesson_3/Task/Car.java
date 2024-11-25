package Tasks.Lesson_3.Task;


import java.util.Comparator;
import java.util.Objects;

public sealed class Car extends Transport implements Moveable permits Sedan, Crossover, SportCar, Jeep  {

    private double maxSpeed;
    private String transmissionType;
    private String brand;
    private Engine engine;
    private Body body;



    @Override
    public String toString() {
        return super.toString() + " Car{" +
                "maxSpeed=" + maxSpeed +
                ", transmissionType='" + transmissionType + '\'' +
                ", brand='" + brand + '\'' +
                ", engine=" +  engine.getEngineParams() +
                ", body=" + body.getBodyParams() +
                "} ";
    }

    public Car() {
        super();
    }

    public Car(Color color, String model, int manufactureYear, double weight, double maxSpeed, String transmissionType, String brand, String engineType, double volume, double horsePower, String bodyType, int doorsNumber, int wheelNumber) {
        super(TransportType.CAR, color, model, manufactureYear, weight);
        this.maxSpeed = maxSpeed;
        this.transmissionType = transmissionType;
        this.brand = brand;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public void move() {
        System.out.println(super.getModel() + " is moving...");
    }

    @Override
    public void turn() {
        System.out.println(super.getModel() + " is turning...");
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

        public Engine() {}


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

        public String getEngineParams() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    ", volume=" + volume +
                    ", horsePower=" + horsePower +
                    '}';
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

        public Body() {}

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

        public String getBodyParams() {
            return "Body{" +
                    "bodyType='" + bodyType + '\'' +
                    ", doorsNumber=" + doorsNumber +
                    ", wheelNumber=" + wheelNumber +
                    '}';
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

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
