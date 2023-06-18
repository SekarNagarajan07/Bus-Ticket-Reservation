package busResv;
public class Bus {
 private int busNo;
  private boolean ac;
  private int capacity; //get and set

  public Bus(int no, boolean ac, int cap) {
    this.busNo = no;
    this.ac = ac;
    this.capacity = cap;
  }

  public int getBusNo() {
    return  busNo;
  }

  public boolean isAc() {
    return ac;
  }
  public int getCapacity() { //accessor method
    return  capacity;
  }
  public void setAc(boolean val) {
    ac = val;
  }

  public void setCapacity(int cap) { //mutator
    capacity = cap;
  }
  public void displayBusInfo() {
    System.out.println("Bus No: " + busNo + " AC: " + ac + " Total Capacity: " + capacity);
  }
}
