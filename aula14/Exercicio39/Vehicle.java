package aula14.Exercicio39;

public abstract class Vehicle {

    private String brand;
    private String model;
    private String color;
    private int weight;
    private int max_velocity;
    private boolean running;

    public Vehicle(String brand, String model, String color, int weight, int max_velocity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.max_velocity = max_velocity;
        this.running = false;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getColor() { return color; }
    public int getWeight() { return weight; }
    public int getMax_velocity() { return max_velocity; }
    public boolean isRunning() { return running; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setColor(String color) { this.color = color; }
    public void setWeight(int weight) { this.weight = weight; }
    public void setMax_velocity(int max_velocity) { this.max_velocity = max_velocity; }
    public void setRunning(boolean running) { this.running = running; }

    public abstract void turnOn();
    public abstract void Acelerate();
    public abstract void Stop();
    public abstract void turnOff();
}
