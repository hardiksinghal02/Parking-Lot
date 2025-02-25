import entities.ParkingLot;
import service.BookingService;
import service.impl.BookingServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookingService bookingService = new BookingServiceImpl();

        List<ParkingLot> parkingLots = bookingService.findAllParkingLots();
    }
}