package aula5.Teste;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio7 {

    public static void main(String[] args) {
        int [] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            numbers[i] = number;
        }
        Arrays.sort(numbers);
        System.out.println("The largest number is: " + numbers[numbers.length - 1]);
        input.close();
    }

}
