package entities.impl;

import entities.DisplayBoard;
import entities.ParkingLevel;

public class RegularParkingLevel extends ParkingLevel {
    public RegularParkingLevel(String parkingLotId) {
        super(parkingLotId);
        super.setDisplayBoard(new DisplayBoard(this));
    }
}
