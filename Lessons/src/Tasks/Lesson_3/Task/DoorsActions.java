package Tasks.Lesson_3.Task;

public interface DoorsActions {
    default void openDoor() {
        System.out.println("Door is open");
    }
    default void closeDoor() {
        System.out.println("Door is closed");
    }
}
