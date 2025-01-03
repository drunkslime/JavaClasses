import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        Scanner input = new Scanner(System.in);

        int option = 0;

        do {
            displayMenu();
            System.out.print("Enter an option: ");
            option = input.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("How much you want to deposit?: ");
                    double depositValue = input.nextDouble();
                    account.depositMoney(depositValue);
                    break;
                }
                case 2: {
                    System.out.println("How much you want to withdraw?: ");
                    double withdrawValue = input.nextDouble();
                    account.withdrawMoney(withdrawValue);
                    break;
                }
                case 3: {
                    System.out.println("Balance: " + account.getBalance());
                    break;
                }
                case 4: {
                    System.out.println("Exiting... Have a nice day!");
                    break;
                }
                default: {
                    System.out.println("Invalid option!");
                    break;
                }
            }
        } while (option != 4);
        input.close();
    }

    static void displayMenu(){
        System.out.println(
            "1. Deposit\n" +
            "2. Withdraw\n" +
            "3. Check Balance\n" +
            "4. Exit\n"
        );
    } 

}