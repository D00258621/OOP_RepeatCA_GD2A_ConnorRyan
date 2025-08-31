import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
//        Player player = new Player(1, "Alice", 22, 62.4);
//        System.out.println(player);
//        Player p = new Player(1, "Ben", 23, 72.1);
//        System.out.println(p);
        PlayerDAO playerDAO = new PlayerDAO();
        Player player = playerDAO.get(7);
        System.out.println(player);
        int result = playerDAO.delete(player);
        System.out.println(result);
    }
}
