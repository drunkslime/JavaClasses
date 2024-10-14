package aula9;

import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = askName(input);
        int userAge = askAge(input);
        int option = 0;
        int leaveOption = (userAge < 18) ? 5 : 6;
        MensagemDeBoasVindas(userName);
        Menu(userAge);
        do {
            option = askOption(input);
            HandleOption(option, userAge);
        } while (option != leaveOption);
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

    public static int askAge(Scanner ageScanner) {
        System.out.print("\nIdade: ");
        int userAge = ageScanner.nextInt();
        return userAge;
    }
    public static String askName(Scanner nameScanner) {
        System.out.print("\nNome: ");
        String userName = nameScanner.nextLine();
        return userName;
    }
    public static int askOption(Scanner optionScanner) {
        System.out.print("\nEscolha opção: ");
        int option = optionScanner.nextInt();
        return option;
    }

    public static void HandleOption(int option, int age){
            switch (option) {
                case 1:
                    System.out.println("Selecionando Entradas");
                    break;
                case 2:
                    System.out.println("Selecionando Prato Carne");
                    break;
                case 3:
                    System.out.println("Selecionando Prato Peixe");
                    break;
                case 4:
                    System.out.println("Selecionando Sobremesa");
                    break;
                case 5:
                    if (age >= 18) {
                        System.out.println("Selecionando Carta de Vinhos");
                        break;
                    } else {
                        System.out.println("Saindo...");
                        break;
                    }
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
    }
}
