package aula7;

import java.util.Vector;
import java.util.Scanner;

public class ExemploVector {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        Scanner input = new Scanner(System.in);
        int sum = 0;
        do {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            numbers.add(number);
            sum += number;
            if (numbers.get(numbers.size() - 1) == 0) break;
        } while (true);
        System.out.println("The sum is: " + sum);
        System.out.print("The rest of the sum division is: " + (sum % 2));
        input.close();
    }
}
