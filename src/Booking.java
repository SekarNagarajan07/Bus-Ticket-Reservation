import busResv.Booking1DAO;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {
  String passengerName;
  int busNo;
  Date date;

  Booking() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name of passenger: ");
    passengerName = sc.next();
    System.out.println("Enter bus no: ");
    busNo = sc.nextInt();
    System.out.println("Enter date dd-mm-yyyy");
    String dateInput = sc.next();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    try {
      date = dateFormat.parse(dateInput);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }

  public boolean isAvailable() throws SQLException {
    BusDAO busdao = new BusDAO();
    Booking1DAO bookingdao = new Booking1DAO();
    int capacity = busdao.getCapacity(busNo);

   int booked = bookingdao.getBookedCount(busNo,date);
    return booked < capacity;
  }
}



