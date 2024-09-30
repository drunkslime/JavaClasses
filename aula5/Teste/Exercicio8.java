package aula5.Teste;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        int [] numbers = new int[5];
        int sum = 0;
        double average;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            numbers[i] = number;
        }
        // Calculate sum
        for (int number: numbers) {
            sum += number;          
        }
        // Calculate average
        average = (double) sum / numbers.length;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
        input.close();
    }


}
