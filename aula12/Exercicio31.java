package aula12;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        try {
            System.out.println( (float) num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Não pode divisar pelo 0");
        }

        input.close();
    }
}
