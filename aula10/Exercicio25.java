package aula10;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();
        System.out.println("Enter current year: ");
        int currentYear = input.nextInt();
        int age = calcAge(yearOfBirth, currentYear);
        System.out.println("Your age is: " + age);
        input.close();
    }

    public static int calcAge(int yearOfBirth, int currentYear) {
        return currentYear - yearOfBirth;
    }
    
}
