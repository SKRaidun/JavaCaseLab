package Tasks.Lesson_3.Task;

public abstract class Transport {
    private TransportType type;
    private Color color;
    private String model;
    private String manufactureYear;
    private double weight;

    public Transport(TransportType type, Color color, String model, String manufactureYear, double weight) {
        this.type = type;
        this.color = color;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.weight = weight;
    }

    public abstract void turnLights();
    public abstract void offLights();


}
