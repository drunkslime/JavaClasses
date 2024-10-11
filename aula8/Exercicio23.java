package aula8;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNome: ");
        String userName = input.nextLine();
        System.out.print("Idade: ");
        int userAge = input.nextInt();
        MensagemDeBoasVindas(userName);
        Menu(userAge);
        input.close();
    }

    public static void MensagemDeBoasVindas(String name) {
        System.out.println(String.format("Seja bem vindo %s", name));
    }

    public static void Menu(int age) {
        if (age < 18) {
            System.out.println("== Menu ==\n" +
                    "1 - Entradas\n" +
                    "2 - Prato Carne\n" +
                    "3 - Prato Peixe\n" +
                    "4 - Sobremesa\n" +
                    "5 - Sair\n");
        } else {
            System.out.println("== Menu ==\n" +
                    "1 - Entradas\n" +
                    "2 - Prato Carne\n" +
                    "3 - Prato Peixe\n" +
                    "4 - Sobremesa\n" +
                    "5 - Carta de Vinhos\n" +
                    "6 - Sair\n");
        }
    }
}
