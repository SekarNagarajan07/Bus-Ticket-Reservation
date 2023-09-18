package busResv;
import java.util.Date;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Booking1DAO {
    public int getBookedCount(int busNo, Date date) throws SQLException {
        String query = "select count(passenger_name)" +
                "from booking where bus_no=? and travel_date=?";
        Connection con = DbConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(query);
        java.sql.Date sqldate = new java.sql.Date((date.getTime()));
        pst.setInt(1,busNo);
        pst.setDate(2,sqldate);
        ResultSet rs = pst.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
}