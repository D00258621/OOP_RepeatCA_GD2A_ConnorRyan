import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO implements InterfaceDAO {

    @Override
    public List<Player> getAll() throws SQLException {
        return null;
    }

    @Override
    public Player get(int id) throws SQLException {
        Connection connection = SqlConnection.getConnection();
        Player player = null;
        String sql = "SELECT id, name, age, winrate FROM players WHERE id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int dID = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            double winRate = rs.getDouble("winrate");

            player = new Player(dID, name, age, winRate);
        }
        SqlConnection.closeConnection(connection);
        SqlConnection.closedPrepareStatement(ps);
        SqlConnection.closeResultSet(rs);
        return player;
    }
    @Override
    public int insert(Player player) throws SQLException {
      return 0;
    }

    @Override
    public int update(Player player) {
        return 0;
    }
    @Override
    public int delete(Player player) {
        return 0;
    }

}
