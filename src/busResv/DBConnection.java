package busResv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

 class DbConnection {
    private static final String url = "jdbc:mysql://localhost:3306/busresv";
    private static final String userName = "sekar";
    private static final String passWord = "Sekar2002@";

    public static Connection getConnection() throws SQLException {
        return  DriverManager.getConnection(url,userName,passWord);
    }

}