package com.parkinglot.service.impl;

import com.parkinglot.dao.ParkingLotDao;
import com.parkinglot.dao.ParkingSpotDao;
import com.parkinglot.dao.impl.ParkingLotDaoImpl;
import com.parkinglot.dao.impl.ParkingSpotDaoImpl;
import com.parkinglot.entities.Booking;
import com.parkinglot.entities.ParkingLot;
import com.parkinglot.entities.ParkingSpot;
import com.parkinglot.enums.SpotType;
import com.parkinglot.exception.ErrorType;
import com.parkinglot.exception.ParkingLotException;
import com.parkinglot.service.BookingService;

import java.util.List;
import java.util.Optional;

public class BookingServiceImpl implements BookingService {

    private final ParkingLotDao parkingLotDao;

    private final ParkingSpotDao parkingSpotDao;

    public BookingServiceImpl(ParkingLotDao parkingLotDao, ParkingSpotDao parkingSpotDao) {
        this.parkingLotDao = parkingLotDao;
        this.parkingSpotDao = parkingSpotDao;
    }

    public List<ParkingLot> findAllParkingLots() {
        return parkingLotDao.findAllParkingLots();
    }

    public boolean checkAvailability(String vehicleType, String startTime, String endTime) {
        return false;
    }

    public Booking reserve(String vehicleType, String startTime, String endTime) {
        return null;
    }

    public ParkingSpot findParkingSpot(String parkingLotId, String vehicleType) {
        List<ParkingSpot> allParkingSpots = parkingSpotDao.findSpotsForParkingLot(parkingLotId);

        if (allParkingSpots == null || allParkingSpots.isEmpty()) {
            throw new ParkingLotException(ErrorType.NOT_FOUND, "No parkinglot found for id : " + parkingLotId);
        }

        SpotType spotType = SpotType.fromName(vehicleType);

        Optional<ParkingSpot> parkingSpotOptional = allParkingSpots
                .stream()
                .filter(spot -> spot.getSpotType().equals(spotType))
                .findFirst();

        if(parkingSpotOptional.isEmpty()) {
            throw new ParkingLotException(ErrorType.NOT_FOUND, "No parking spot found for vehicle type : " + vehicleType);
        }

        return parkingSpotOptional.get();
    }
}
