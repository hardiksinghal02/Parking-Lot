package com.parkinglot.entities.impl;

import com.parkinglot.entities.ParkingSpot;
import com.parkinglot.enums.SpotType;

public class RegularParkingSpot extends ParkingSpot {
    public RegularParkingSpot(String levelId, String parkingLotId) {
        super(levelId, parkingLotId, SpotType.REGULAR);
    }
}
