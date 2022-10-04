public class Withdraw {

    public void withdrawAmount(int amount){
        MiniStatement miniStatement = new MiniStatement();
        if(Main.balance - amount >= 0){
            Main.balance -= amount;
            System.out.printf("%n%d is withdrawn successfully%n%n", amount);

            System.out.println("Generating mini statement . . .");
            miniStatement.miniStatement(amount,"Withdrawn");

            //Adding transaction to transaction List
            String transactionStatement = (java.time.LocalDate.now()) + "\nWithdrawn: " + amount;
            Transactions.transactionsList.add(transactionStatement);
        }else {
            System.out.println("Insufficient Balance\nअपर्याप्त शेषराशि");
        }
    }
}
