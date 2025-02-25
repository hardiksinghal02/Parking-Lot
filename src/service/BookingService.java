package service;

import entities.Booking;
import entities.ParkingLot;

import java.util.List;

public interface BookingService {

    List<ParkingLot> findAllParkingLots();
    boolean checkAvailability(String vehicleType, String startTime, String endTime);
    Booking reserve(String vehicleType, String startTime, String endTime);
}
