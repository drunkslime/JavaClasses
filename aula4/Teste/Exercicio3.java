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
        String name;
        int age, salary;
        char gender, maritalStatus;
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
            gender = input.next().toLowerCase().charAt(0);
            char female = 'f', male = 'm';
            if (gender == female || gender == male) {
                break;
            }
            else System.out.println("Invalid gender");;
        } while (true);
        // Ignore lower
        do {
            System.out.println("Marital Status: ");
            maritalStatus = input.next().toLowerCase().charAt(0);
            char single = 's', civil = 'c', married = 'v', divorced = 'd';
            if (maritalStatus == single || maritalStatus == civil || maritalStatus == married || maritalStatus == divorced) {
                break;
            }
            else System.out.println("Invalid marital status");
        } while (true);
        System.out.println(name + "\n" + 
                            age + "\n" +
                            salary + "\n" +
                            gender + "\n" +
                            maritalStatus);
        input.close();
    }
}
