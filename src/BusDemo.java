import busResv.Bus;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
  public static void main(String[] args) throws SQLException {

/*
   Without jdbc connection

  ArrayList<Bus> buses = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();
    buses.add(new Bus(1, true, 1));
    buses.add(new Bus(2, false, 20));
    buses.add(new Bus(3, true, 30));*/

BusDAO busdao = new BusDAO();
busdao.displayBusInfo();
    int userOptions = 1;
    Scanner sc = new Scanner(System.in);

    for(Bus b : buses) {
      b.displayBusInfo();
    }

    while (userOptions == 1) {
      System.out.println("Enter 1 to Book and 2 to Exit : ");
      userOptions = sc.nextInt();
      if (userOptions == 1) {
        Booking booking = new Booking();
        if(booking.isAvailable()) {
          bookings.add(booking);
          System.out.println("Your booking is confirmed");
        }
        else {
          System.out.println("Sorry, seat is full. Try another bus or date.");
        }
      }
    }

  }
}
