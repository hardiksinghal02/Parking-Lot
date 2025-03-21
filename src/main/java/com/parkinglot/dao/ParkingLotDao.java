package com.parkinglot.dao;

import com.parkinglot.entities.ParkingLot;

import java.util.List;

public interface ParkingLotDao {

    List<ParkingLot> findAllParkingLots();

    ParkingLot findParkingLotById(String parkingLotId);
}
