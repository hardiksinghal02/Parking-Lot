package com.parkinglot.entities.impl;

import com.parkinglot.entities.ParkingSpot;
import com.parkinglot.enums.SpotType;

public class CompactParkingSpot extends ParkingSpot {
    public CompactParkingSpot(String levelId, String parkingLotId) {
        super(levelId, parkingLotId, SpotType.COMPACT);
    }
}
