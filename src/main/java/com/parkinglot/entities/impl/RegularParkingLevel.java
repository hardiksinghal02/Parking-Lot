package com.parkinglot.entities.impl;

import com.parkinglot.entities.DisplayBoard;
import com.parkinglot.entities.ParkingLevel;

public class RegularParkingLevel extends ParkingLevel {
    public RegularParkingLevel(String parkingLotId) {
        super(parkingLotId);
        super.setDisplayBoard(new DisplayBoard(this));
    }
}
