package aula5;

import java.util.Arrays;

public class Atividade18 {
    public static void main(String[] args) {
        // Create empty zero-length array
        int [] numbers = new int[0];
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {

            if (numbers.length == 5) break;

            if (i % 3 == 0 && i % 5 == 0) {
                // Make copy of the same array but with one more element
                numbers = Arrays.copyOf(numbers, numbers.length + 1);
                numbers[numbers.length - 1] = i;
                System.out.println(i); 
            }

        }

        for (int number: numbers) {
            sum += number;
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}