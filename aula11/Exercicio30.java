package aula11;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nNúmero total de alunos: ");
        int totalStudents = input.nextInt();

        double[] studentGrades = new double[totalStudents];
        double sum = 0;
        for (int i = 0; i < totalStudents; i++) {
            System.out.print("\nNota do " + (i + 1) + "║ aluno: ");
            studentGrades[i] = input.nextDouble();

            sum += studentGrades[i];
        }

        double average;

        average = sum / totalStudents;
        System.out.println("\n Média das notas (original): " + average
                + "\nMédia das notas (convertida para int): " + (int) average);

        input.close();
    }
}
