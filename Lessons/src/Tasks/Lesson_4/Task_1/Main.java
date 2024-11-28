package Tasks.Lesson_4.Task_1;

public class Main {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("Hello");

        StringBuilderClass catching = new StringBuilderClass();

        catching.newString(string);

        ConcreteObserver observer1 = new ConcreteObserver(catching, "Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver(catching, "Observer 2");

        catching.getString();

        string.append(" World");

        catching.newString(string);

        catching.removeObservers(observer1);

        System.out.println("------------------");

        catching.notifyObservers();

        string.append("!");

        System.out.println("------------------");

        catching.newString(string);
        
    }
}
