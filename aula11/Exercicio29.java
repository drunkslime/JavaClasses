package aula11;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nInsira um número decimal: ");
        double number = input.nextDouble();

        System.out.println("Número original: " + number
                + "\nNúmero convertido para int: " + (int) number // implicito
                + "\nNúmero convertido para float: " + (float) number // implicito
                + "\nNúmero convertido para long: " + (long) number); // implicito

    input.close();
    }
}
