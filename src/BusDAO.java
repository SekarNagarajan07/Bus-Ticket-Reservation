import com.mysql.cj.protocol.x.ReusableOutputStream;

import java.sql.Connection;
import java.sql.*;

//Data Access Object
public class BusDAO {
  public void  displayBusInfo() throws SQLException {
      String query = "select * from bus";
      Connection con =  DbConnection.getConnection();
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(query);

      while(rs.next()) {
          System.out.println("Bus No: " + rs.getInt(1));
          if(rs.getInt(2)==0)
              System.out.println("AC: no ");
          else
              System.out.println("AC: yes ");
          System.out.println("Capacity: " + rs.getInt(3));
      }
    }
}
