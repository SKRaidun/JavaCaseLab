package Tasks.Lesson_4.Task_1;

public interface Subject {

    void attachObserver(Observer observer);
    void removeObservers(Observer observer);
    void notifyObservers();

}
