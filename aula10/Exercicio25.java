package aula10;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, insira o ano atual: ");
        int currentYear = input.nextInt();
        System.out.println("Insira o seu ano de nascimento: ");
        int yearOfBirth = input.nextInt();
        int age = calcAge(yearOfBirth, currentYear);
        System.out.println("A sua idade atual é: " + age + " Anos.");
        input.close();
    }

    public static int calcAge(int yearOfBirth, int currentYear) {
        return currentYear - yearOfBirth;
    }
    
}
