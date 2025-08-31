import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO implements InterfaceDAO {

    @Override
    public List<Player> getAll() throws SQLException {
        Connection con = SqlConnection.getConnection();
        String sql = "SELECT id, name, age, winrate FROM players";
        List<Player> players = new ArrayList<Player>();
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            int dID = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            double winRate = rs.getDouble("winrate");
            Player player = new Player(dID, name, age, winRate);
            players.add(player);
        }
        SqlConnection.closeConnection(con);
        SqlConnection.closeStatement(statement);
        SqlConnection.closeResultSet(rs);
        return players;

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
      Connection connection = SqlConnection.getConnection();
      String sql = "INSERT INTO players (name, age, winrate) VALUES (?, ?, ?)";
      PreparedStatement ps = connection.prepareStatement(sql);

      ps.setString(1, player.getName());
      ps.setInt(2, player.getAge());
      ps.setDouble(3, player.getWinrate());
      int result = ps.executeUpdate();

      SqlConnection.closeConnection(connection);
      SqlConnection.closedPrepareStatement(ps);
      return result;
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
