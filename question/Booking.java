package question;

package FRS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Booking{
    private String booking_id;
    private String flight_id;
    private String passenger_id;

    public Booking(String booking_id, String flight_id, String passenger_id) {
        this.booking_id = booking_id;
        this.flight_id = flight_id;
        this.passenger_id = passenger_id;
    }

    public String getBooking_id() {
        return booking_id;
    }

    public String getFlight_id() {
        return flight_id;
    }

    public String getPassenger_id() {
        return passenger_id;
    }
    //List flights with number of passengers booked.
    public static void showFlightPassengerCount(List<Booking> bookings) {
        HashMap<String,Integer> mp = new HashMap<>();
      
        for(Booking booking:bookings) {
            String flight_id = booking.getFlight_id();
            mp.put(flight_id,mp.getOrDefault(flight_id,0) + 1);
        }
        System.out.println("Flight-wise passenger booking count:");
        for(Map.Entry<String,Integer> e : mp.entrySet()) {
            System.out.println("Flight " + e.getKey() + "  " + e.getValue() + " passengers");
        }
    }
    public static void main(String[] args) {
        List<Booking> bookings = new ArrayList<>();
        bookings.add(new Booking("B001", "F101", "P001"));
        bookings.add(new Booking("B002", "F101", "P002"));
        bookings.add(new Booking("B003", "F102", "P003"));
        bookings.add(new Booking("B004", "F103", "P004"));
        bookings.add(new Booking("B005", "F101", "P005"));
        bookings.add(new Booking("B006", "F102", "P006"));

        showFlightPassengerCount(bookings);
    }
}