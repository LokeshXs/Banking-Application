
import java.time.LocalDate;
import java.time.LocalTime;

public class MiniStatement {
    public void miniStatement(int amount,String type){
        System.out.println("\n*********************************************************************\n");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();


        System.out.println("Date: "+ date);
        System.out.println("Time: "+ time);

        System.out.println("\nUserName: "+Menu.userName);

        System.out.println();
        System.out.println(type+" amount: "+amount);
        System.out.println("Current Balance: "+Main.balance);
        System.out.println("\n*********************************************************************\n");

    }
}
