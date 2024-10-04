package aula7;

import java.util.Vector;
import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<>();
        int sum = 0;
        do {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            if (number != -1) {
                numbers.add(number);
                sum += number;
            } else {
                break;
            };
        } while (true);
        System.out.println("The sum is: " + sum);
        input.close();
    }    
}
