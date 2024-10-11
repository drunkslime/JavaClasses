package aula8;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNome: ");
        String username = input.nextLine();
        MensagemDeBoasVindas(username);
        Menu();
        input.close();
    }

    public static void MensagemDeBoasVindas(String name) {
        System.out.println(String.format("Seja bem vindo %s", name));
    }

    public static void Menu() {
        System.out.println("== Menu ==\n" +
                "1 - Entradas\n" +
                "2 - Prato Carne\n" +
                "3 - Prato Peixe\n" +
                "4 - Sobremesa\n" +
                "5 - Sair\n");
    }
}
