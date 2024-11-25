package Tasks.Lesson_3.Task;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Transport transport;

        Scanner scn = new Scanner(System.in);


        System.out.println("Введите тип транспортного средства:");
        System.out.println("1. Ground transport \n2. Air transport \n3. Water transport");
        int type = scn.nextInt();
        switch(type) {
            case 1:
                transport = new Car();
                break;
            default: transport = new Car();
        }

        Menu.menu(transport, scn);

    }

}
