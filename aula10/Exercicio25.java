package aula10;

import java.util.Scanner;
import java.util.Calendar;

public class Exercicio25 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, insira o ano atual: ");
        int currentYear = input.nextInt();

        System.out.println("Insira o seu ano de nascimento: ");
        int yearOfBirth = input.nextInt();

        System.out.println("public static int calcAge(int yearOfBirth, int currentYear)");
        int age1 = calcAge(yearOfBirth, currentYear);
        System.out.println("A sua idade atual é: " + age1 + " Anos.");
        
        System.out.println("public static int calcAge(int yearOfBirth)");
        int age2 = calcAge(yearOfBirth);
        System.out.println("A sua idade atual é: " + age2 + " Anos.");

        input.close();
    }

    public static int calcAge(int yearOfBirth, int currentYear) {
        return currentYear - yearOfBirth;
    }

    public static int calcAge(int yearOfBirth) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return  currentYear - yearOfBirth;
    }
}
