package aula4.Teste;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // 1
        Scanner input = new Scanner(System.in);
        do {        
            System.out.print("Enter a grade(0-10): ");
            int grade = input.nextInt();
            if (grade < 0 || grade > 10) {
                System.out.println("Invalid grade");
            } else break;
        } while (true);
        input.nextLine();
        // 2
        do {        
            System.out.println("Username: ");
            String username = input.nextLine();
            System.out.println("Password: ");
            String password = input.nextLine();
            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Invalid username or password");
            } 
            if (!username.equals(password)) {
                System.out.println(username + " " + password);
                break;
            } else System.out.println("Username and password cannot be the same");
        } while (true);
        

        // 3
        String name, gender, maritalStatus;
        int age, salary;
        do {
            System.out.println("Name: ");
            name = input.nextLine();
            if (name.isEmpty() || name.length() < 3) System.out.println("Invalid name");
            else break;
        } while (true);
        do {
            System.out.println("Age: ");
            age = input.nextInt();
            if (age <= 0 || age >= 150) System.out.println("Invalid age");
            else break;
        } while (true);
        do {
            System.out.println("Salary: ");
            salary = input.nextInt();
            if (salary <= 0) System.out.println("Invalid salary");
            else break;
        } while (true);
        input.nextLine();
        do {
            System.out.println("Gender: ");
            gender = input.next().toLowerCase();
            if (gender.equals("f") && gender.equals("m")) {
                break;
            }
            else System.out.println("Invalid gender");
        } while (true);
        // Ignore lower
        do {
            System.out.println("Marital Status: ");
            maritalStatus = input.next();
            System.out.println(maritalStatus);
            if (!maritalStatus.equals('s') || !maritalStatus.equals('c') || !maritalStatus.equals('v') || !maritalStatus.equals('d')) System.out.println("Invalid marital status");
            else break;
        } while (true);
        System.out.println(name + "\n" + 
                            age + "\n" +
                            salary + "\n" +
                            gender + "\n" +
                            maritalStatus);
        input.close();
    }
}
