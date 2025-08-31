import java.sql.SQLException;
import java.util.List;

public interface DAO<Player> {
    List<Player> getAll() throws SQLException;
    Player get(int Id) throws SQLException;
    int insert(Player player) throws  SQLException;
    int update(Player player) throws SQLException;
    int delete(Player player) throws SQLException;
}
