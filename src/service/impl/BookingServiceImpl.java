package service.impl;

import entities.Booking;
import entities.ParkingLot;
import service.BookingService;

import java.util.List;

public class BookingServiceImpl implements BookingService {

    public List<ParkingLot> findAllParkingLots() {
        return null;
    }

    public boolean checkAvailability(String vehicleType, String startTime, String endTime) {
        return false;
    }

    public Booking reserve(String vehicleType, String startTime, String endTime) {

    }
}
