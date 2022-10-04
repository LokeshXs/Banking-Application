public class Deposit {

    public void depositAmount(int amount) {
        MiniStatement miniStatement = new MiniStatement();
        if (amount > 0) {
            Main.balance += amount;
            System.out.printf("%n%d is deposited successfully%n%n", amount);

            System.out.println("Generating mini statement . . .");
            miniStatement.miniStatement(amount, "Deposited");

            //Adding transaction to transaction List
            String transactionStatement = (java.time.LocalDate.now()) + "\nDeposited: " + amount;
            Transactions.transactionsList.add(transactionStatement);

        } else {
            System.out.println("Amount is invalid \nराशि अमान्य है");
        }
    }

}
