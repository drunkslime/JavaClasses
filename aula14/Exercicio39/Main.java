package aula14.Exercicio39;

public class Main {
    public static void main(String[] args) {
        Car RedHondaCivic = new Car("Honda", "Civic", "Red", 1500, 200, 100.00);
        Motorcycle BlackHondaCruiser = new Motorcycle("Honda", "Cruiser", "Black", 500, 200, 50.00);

        System.out.println("Red Honda Civic price for 1 day: " + RedHondaCivic.CalculateHirePrice(1));
        System.out.println("Red Honda Civic price for 1 month: " + RedHondaCivic.CalculateHirePrice(30));
        System.out.println("Red Honda Civic price for 1 year: " + RedHondaCivic.CalculateHirePrice(365));
        System.out.println("");
        System.out.println("Black Honda Cruiser price for 1 day: " + BlackHondaCruiser.CalculateHirePrice(1));
        System.out.println("Black Honda Cruiser price for 1 month: " + BlackHondaCruiser.CalculateHirePrice(30));
        System.out.println("Black Honda Cruiser price for 1 year: " + BlackHondaCruiser.CalculateHirePrice(365));
    }
}
