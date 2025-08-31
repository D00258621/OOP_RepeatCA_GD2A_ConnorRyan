import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class SqlConnection {
    private static String url = "jdbc:mysql://localhost:3306/game_db";
    private static String user = "root";
    private static String password = "";

    public SqlConnection() {
    }

    public static Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(url, user, password);
        return con;
    }
    public static void closeConnection(Connection con) throws SQLException {
        con.close();
    }
    public static void closeStatement(Statement state) throws SQLException {
        state.close();
    }
    public static void closedPrepareStatement(PreparedStatement pState) throws SQLException{
        pState.close();
    }
    public static void closeResultSet(ResultSet resultSet) throws SQLException {
        resultSet.close();;
    }
}
