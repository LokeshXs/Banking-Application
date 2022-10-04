import java.util.ArrayList;

public class Transactions {
    static ArrayList<String> transactionsList = new ArrayList<>();

    public void showTransactions(int num) {

        if(num > transactionsList.size()){
            num = transactionsList.size();
        }

        if (num > 0) {
            for (int i = 0; i < num; i++) {
                System.out.println("---------------------------------");
                System.out.println("\n" + transactionsList.get(i) + "\n");
            }
        }else {
            System.out.println("Invalid input");
        }
    }
}
