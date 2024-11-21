package Tasks.Lesson_3.Task;

public interface EngineActions {

    default void StartEngine() {
        System.out.println("Engine is started");
    }

    default void StopEngine() {
        System.out.println("Engine is stopped");
    }
}
