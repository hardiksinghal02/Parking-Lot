package com.parkinglot.dao;

import com.parkinglot.entities.ParkingSpot;

import java.util.List;

public interface ParkingSpotDao {

    List<ParkingSpot> findSpotsForParkingLot(String parkingLotId);
}
