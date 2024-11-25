package Tasks.Lesson_3.Task;

public abstract class Transport {
    private TransportType type;
    private Color color;
    private String model;
    private int manufactureYear;
    private double weight;

    public Transport() {
    }

    public TransportType getType() {
        return type;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Transport(TransportType type, Color color, String model, int manufactureYear, double weight) {
        this.type = type;
        this.color = color;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.weight = weight;
    }

    public abstract void turnLights();
    public abstract void offLights();

    @Override
    public String toString() {
        return "Transport{" +
                "type=" + type +
                ", color=" + color +
                ", model='" + model + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", weight=" + weight +
                '}';
    }
}
