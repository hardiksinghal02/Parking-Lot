package com.parkinglot.service;

import com.parkinglot.entities.Booking;
import com.parkinglot.entities.ParkingLot;
import com.parkinglot.entities.ParkingSpot;

import java.util.List;

public interface BookingService {

    List<ParkingLot> findAllParkingLots();

    boolean checkAvailability(String vehicleType, String startTime, String endTime);

    Booking reserve(String vehicleType, String startTime, String endTime);

    ParkingSpot findParkingSpot(String parkingLotId, String vehicleType);
}
