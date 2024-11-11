package aula14.Exercicio39;

public class Car extends Vehicle{

    public Car(String brand, String model, String color, int weight, int max_velocity, double price) {
        super(brand, model, color, weight, max_velocity, price);
    }
    
    public void turnOn() {
        setRunning(true);
        System.out.println(String.format("%s is running now", getBrand()));
    }
    
    public void turnOff() {
        setRunning(false);
        System.out.println(String.format("%s is turned off now", getBrand()));
    }

    public void Acelerate() {
        if(isRunning()) {
            System.out.println(String.format("%s is running", getBrand()));
        } else {
            System.out.println(String.format("%s is turned off now", getBrand()));
        }
    }

    public void Stop() {
        if(isRunning()) {
            System.out.println("Car is stopping");
        } else {
            System.out.println(String.format("%s is turned off now", getBrand()));
        }
    }

    public double CalculateHirePrice(int days) {
        return days * getPrice();
    }
}
