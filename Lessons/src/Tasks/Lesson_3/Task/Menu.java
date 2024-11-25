package Tasks.Lesson_3.Task;

import java.util.Scanner;

public class Menu {

    public double sum(double a, double l) {
        return a + l;
    }

    public static void carBuilder(Car car, Scanner scn) {

        System.out.println("Введите максимальную скорость:");
        car.setMaxSpeed(scn.nextDouble());

        System.out.println("Введите тип трансмисии");
        car.setTransmissionType(scn.next());

        System.out.println("Введите марку автомобиля");
        car.setBrand(scn.next());

        System.out.println("Введите параметры двигателя:");
        Car.Engine engine = car.new Engine();
        System.out.println("Тип двигателя:");
        engine.setEngineType(scn.next());
        System.out.println("Объем двигателя:");
        engine.setVolume(scn.nextDouble());
        System.out.println("Количество лошадинных сил");
        engine.setHorsePower(scn.nextDouble());

        System.out.println("Введите параметры кузова:");
        Car.Body body = car.new Body();
        System.out.println("Тип кузова:");
        body.setBodyType(scn.next());
        System.out.println("Число дверей:");
        body.setDoorsNumber(scn.nextInt());
        System.out.println("Число колес:");
        body.setWheelNumber(scn.nextInt());
        car.setEngine(engine);
        car.setBody(body);



        System.out.println("Введите желаемый тип машины:");
        System.out.println("1. Sedan \n2. Crossover \n3. Jeep \n4. Sport Car");

        switch (scn.nextInt()) {
            case 1:
                Sedan sedan = new Sedan();
                sedan = (Sedan) car;
                System.out.println(sedan);
                break;
            case 2:
                Crossover crossover = new Crossover();
                crossover = (Crossover) car;
                System.out.println(crossover);
                break;
            case 3:
                Car jeep = new Jeep();
                jeep = (Jeep) car;
                System.out.println(jeep);
                break;
            case 4:
                SportCar sportCar = new SportCar();
                sportCar = (SportCar) car;
                System.out.println(sportCar);
                break;
            default:
                Sedan newcar = new Sedan();
                newcar = (Sedan) car;
                break;
        }
    }

    public static void menu(Transport transport, Scanner scn) {


        System.out.println("Введите номер цвета ТС:");
        System.out.println("1. White \n2. Black \n3. Green \n4. Yellow \n5. Orange \n6. Grey \n7. Red \n8. Blue");
        int colorNumber = scn.nextInt();
        switch (colorNumber) {
            case 1:
                transport.setColor(Color.WHITE);
                break;
            case 2:
                transport.setColor(Color.BLACK);
                break;
            case 3:
                transport.setColor(Color.GREEN);
                break;
            case 4:
                transport.setColor(Color.YELLOW);
                break;
            case 5:
                transport.setColor(Color.ORANGE);
                break;
            case 6:
                transport.setColor(Color.GREY);
                break;
            case 7:
                transport.setColor(Color.RED);
                break;
            case 8:
                transport.setColor(Color.BLUE);
                break;
        }

        System.out.println("Введите модель транспорта");
        transport.setModel(scn.next());

        System.out.println("Введите год выпуска транспорта");
        transport.setManufactureYear(scn.nextInt());

        System.out.println("Введите вес транспорта");
        transport.setWeight(scn.nextDouble());

        if (transport instanceof Car) {
            carBuilder((Car) transport, scn);
        }



    }
}
