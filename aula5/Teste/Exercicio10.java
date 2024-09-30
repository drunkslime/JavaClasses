package aula5.Teste;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting point: ");
        int startingNumber = input.nextInt();
        System.out.println("Enter ending point: ");
        int endingNumber = input.nextInt();
        System.out.println("");
        for (int i = startingNumber; i < endingNumber; i++) {
            System.out.println(i);
        }
        input.close();
    }

}
