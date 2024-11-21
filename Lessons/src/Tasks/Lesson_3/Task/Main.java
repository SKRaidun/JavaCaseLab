package Tasks.Lesson_3.Task;
import java.util.Scanner;

public class Main {

    public static void menu() {
        Scanner scn = new Scanner(System.in);

        Transport<> transport;

        System.out.println("Введите тип транспортного средства:");
        System.out.println("1. Car \n2. Bike \n3. Motorcycle \n4. Helicopter \n5. Airplane \n6. Boat");
        int type = scn.nextInt();

        System.out.println("Введите цвет ТС:");
        String color = scn.next();


    }
    public static void main(String[] args) {

        menu();
        Car transport = new Car();

        System.out.println("Введите цвет ТС:");
        String color = scn.next();

        if (color.equalsIgnoreCase("white")) {
            transport.setColor(Color.WHITE);
        }

        System.out.println("Введите тип двигателя");

        transport.setEngine(scn.next());

        System.out.println("Введите максимальную скорость");

        transport.setMaxSpeed(scn.nextInt());

        System.out.println("Введите количество топлива");

        transport.setFuelAmount(scn.nextInt());

        System.out.println(transport);
    }
}
