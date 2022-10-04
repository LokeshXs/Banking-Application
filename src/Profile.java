import java.util.Scanner;

public class Profile {

    public void editProfile() {
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\nSelect what you want to edit ");
            System.out.println("Press:");
            System.out.println("1. UserName\n2. Pin");
            System.out.printf("%S", "Press 'e' to exit");
            System.out.println();
            char option = in.next().trim().charAt(0);

            switch (option) {
                case '1' -> {
                    System.out.println("Current UserName: " + Menu.userName);
                    System.out.print("Enter New UserName: ");
                    Menu.userName = in.next().trim();
                    System.out.println();
                    System.out.println("UserName updated Successfully");
                }

                case '2' -> {
                    while (true) {
                        System.out.print("Enter Current Pin: ");
                        int currentPin = in.nextInt();
                        System.out.println();
                        if (currentPin == Menu.pin) {
                            System.out.print("Enter New Pin: ");
                            Menu.pin = in.nextInt();
                            System.out.println("\nPin is updated successfully");
                            break;
                        } else {
                            System.out.println("InCorrect Pin");
                        }
                    }
                }
                case 'E','e'->{
                    System.out.println("Details saved successfully");
                    return;
                }
            }


        }while (true);
    }
}
