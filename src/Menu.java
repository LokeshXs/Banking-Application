import java.util.Scanner;

public class Menu {
    static String userName;
    static int pin;

    public void mainMenu() {
        Scanner input = new Scanner(System.in);
        char option;

        System.out.print("UserName - ");
        userName = input.next().trim();
        System.out.println();
        System.out.print("Pin - ");
        pin =  input.nextInt();
        System.out.println("\n");
        System.out.printf("%50s","Welcome "+userName+" ✔\n\n");


        do {
            System.out.println("\nPress: ");
            System.out.println("1. to deposit amount");
            System.out.println("2. to withdraw amount");
            System.out.println("3. to show current balance");
            System.out.println("4. to view transactions");
            System.out.println("5. to edit profile");
            System.out.println("6. to change ATM pin");
            System.out.printf("%n%S%n", "press 'x' to exit!");

            option = input.next().trim().charAt(0);

            switch (option) {
                case '1':
                    Deposit deposit = new Deposit();
                    System.out.print("Enter amount: \n");
                    int amount = input.nextInt();
                    deposit.depositAmount(amount);
                    break;

                case '2':
                    Withdraw withdraw = new Withdraw();
                    System.out.print("Enter amount: \n");
                    int amount2 = input.nextInt();
                    withdraw.withdrawAmount(amount2);
                    break;

                case '3':
                    System.out.printf("Current Balance: %d%n%n",Main.balance);
                    break;

                case '4':
                    if(Transactions.transactionsList.isEmpty()){
                        System.out.println("\nEmpty\n");
                    }else {
                        System.out.print("Enter number of transaction: ");
                        int num = input.nextInt();
                        Transactions transactions = new Transactions();
                        transactions.showTransactions(num);
                    }
                    break;

                case '5':
                    Profile profile = new Profile();
                    profile.editProfile();
                    break;

                case '6':
                    System.out.print("Enter current pin: ");
                    input.nextInt();
                    System.out.print("\nEnter new pin: ");
                    input.nextInt();
                    System.out.println("Pin changed successfully");
                    break;

                case 'x', 'X':
                    System.out.println("Logging out . . .\n");
                    return;


            }

        } while (true);

    }

}
