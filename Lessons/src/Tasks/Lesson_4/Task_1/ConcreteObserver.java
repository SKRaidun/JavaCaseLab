package Tasks.Lesson_4.Task_1;

public class ConcreteObserver implements Observer{

    private String observerName;

    public ConcreteObserver (Subject subject, String name) {
        this.observerName = name;
        subject.attachObserver(this);
    }
    @Override
    public void update(StringBuilder string) {
        System.out.println("Observer with name "+ observerName + " catch new string:" + " " + string);
    }
}
