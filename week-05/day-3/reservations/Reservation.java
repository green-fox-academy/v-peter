package reservations;

import java.util.Random;

public class Reservation implements Reservationy {
  String[] dows = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};


  @Override
  public String getDowBooking() {
    return dows[(int) (Math.random() * dows.length)];
  }

  @Override
  public String getCodeBooking() {
    StringBuilder sb = new StringBuilder();
    Random r = new Random();
    char c;
    for (int i = 0; i < 8; i++) {
      int random = r.nextInt(36);
      if (random < 10) c = (char) (random + 48);
      else c = (char) (random + 55);
      sb.append(c);
    }
    return sb.toString();
  }

  void printReservation() {
    System.out.println(String.format("Booking# %1$s for %2$s",
        getCodeBooking(), getDowBooking()));
  }

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      Reservation r = new Reservation();
      r.printReservation();
    }
  }

}
