package aula14.Exercicio39;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> hiredVehicles = new ArrayList<>();
        do {
            System.out.println("Choose an option:" +
                    "\n1 - Add Car" +
                    "\n2 - Add Motorcycle" +
                    "\n3 - Hire Vehicle" +
                    "\n4 - List Vehicles" +
                    "\n5 - List Hired Vehicles" +
                    "\n6 - Exit");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: {
                    System.out.println("Brand: ");
                    String brand = scanner.nextLine();

                    System.out.println("Model: ");
                    String model = scanner.nextLine();

                    System.out.println("Color: ");
                    String color = scanner.nextLine();

                    System.out.println("Weight: ");
                    int weight = scanner.nextInt();

                    System.out.println("Max Velocity: ");
                    int max_velocity = scanner.nextInt();

                    System.out.println("Price: ");
                    double price = scanner.nextDouble();

                    vehicles.add(CreateCar(brand, model, color, weight, max_velocity, price));
                    System.out.println("Car successfully added");
                    break;
                }
                case 2: {
                    System.out.println("Brand: ");
                    String brand = scanner.nextLine();

                    System.out.println("Model: ");
                    String model = scanner.nextLine();

                    System.out.println("Color: ");
                    String color = scanner.nextLine();

                    System.out.println("Weight: ");
                    int weight = scanner.nextInt();

                    System.out.println("Max Velocity: ");
                    int max_velocity = scanner.nextInt();

                    System.out.println("Price: ");
                    double price = scanner.nextDouble();

                    vehicles.add(CreateMotorcycle(brand, model, color, weight, max_velocity, price));
                    System.out.println("Motorcycle successfully added");
                    break;
                }
                case 3: {
                    ShowVehicles(vehicles);

                    System.out.println("\nSelect a vehicle (ID): ");
                    int id = scanner.nextInt();

                    System.out.println("Days for hire: ");
                    int days = scanner.nextInt();

                    System.out.println("Congratulations! The vehicle was successfully hired. It cost: " + vehicles.get( id-1 ).CalculateHirePrice(days));
                    hiredVehicles.add(vehicles.get( id-1 ));
                    vehicles.remove( id-1 );
                    break;
                }
                case 4: {
                    ShowVehicles(vehicles);
                    break;
                }
                case 5: {
                    ShowVehicles(hiredVehicles);
                    break;
                }
                case 6:
                    System.out.println("Goodbye! All data will be lost!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while(option != 6);

        scanner.close();
    }

    public static Car CreateCar(String brand, String model, String color, int weight, int max_velocity, double price) {
        return new Car(brand, model, color, weight, max_velocity, price);
    }

    public static Motorcycle CreateMotorcycle(String brand, String model, String color, int weight, int max_velocity, double price) {
        return new Motorcycle(brand, model, color, weight, max_velocity, price);
    }

    public static void ShowVehicles(List<Vehicle> vehicles) {
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println((i + 1) + " - " + vehicles.get(i).getBrand() + " " + vehicles.get(i).getModel() + " " + vehicles.get(i).getColor() + " " + vehicles.get(i).getPrice() + "€/day");
        }
    }
}
