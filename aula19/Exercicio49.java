package aula19;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio49 {

    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
    
        int option = 0;
        do {
            System.out.println("Choose an option:" +
                    "\n1 - Add client" +
                    "\n2 - See next client" +
                    "\n3 - Attend client" +
                    "\n4 - Show full queue" +
                    "\n5 - Exit");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter client name: ");
                    String clientName = scanner.nextLine();
                    queue.add(clientName);
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty");
                    } else {
                        System.out.println("The next client is: " + queue.peekFirst());
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty");
                    } else {
                        System.out.println("The client " + queue.removeFirst() + " was attended");
                    }
                    break;
                case 4:
                    System.out.println(queue);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option");
            } 
        } while (option != 5);
        scanner.close();
    }
}

