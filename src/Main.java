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
                    if (scanner.nextLine().equalsIgnoreCase("Y")) {
                        System.out.println("Good Bye");
                        loop = false;
                    } else {
                        loop = true;
                    }
                    break;
                case 1:
                    System.out.println("\n\n\nLoading Database...");
                    PlayerDAO player1 = new PlayerDAO();
                    List<Player> p = player1.getAll();
                    for (Player p1 : p) {
                        System.out.println(p1);
                    }
                    break;
                case 2:
                    System.out.println("ID of player you want to find");
                    int Fid = scanner.nextInt();
                    PlayerDAO player2 = new PlayerDAO();
                    Player p2 = player2.get(Fid);
                    System.out.println(p2);
                    break;
                case 3:
                    PlayerDAO player3 = new PlayerDAO();
                    System.out.println("Insert Player Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Insert Player Age: ");
                    int age = scanner.nextInt();
                    System.out.println("Insert Player Winrate: ");
                    double winrate = scanner.nextDouble();

                    Player newPlayer = new Player(0, name, age, winrate);
                    int result = player3.insert(newPlayer);
                    if (result == 1) {
                        System.out.println("Player inserted successfully");
                    } else {
                        System.out.println("Player insert failed, please try again");
                    }
                    break;

            }
        }
    }
}
