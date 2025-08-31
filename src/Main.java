import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Boolean loop = true;

        while (loop) {
            System.out.println("\n\n---Player Database---");
            System.out.println("Select an option: ");
            System.out.println("1. List all Players");
            System.out.println("2. Find by ID");
            System.out.println("3. Insert New Player");
            System.out.println("4. Update Player");
            System.out.println("5. Delete Player");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Are you sure you want to exit? Y/N");
                    if (scanner.nextLine().equals("Y")) {
                        System.out.println("Good Bye");
                        loop = false;
                    } else {
                        loop = true;
                    }
                    break;
                case 1:
                    System.out.println("\n\n\nLoading Database...");
                    PlayerDAO player = new PlayerDAO();
                    List<Player> p = player.getAll();
                    for (Player p1 : p) {
                        System.out.println(p1);
                    }
                    break;
            }
        }
    }
}
