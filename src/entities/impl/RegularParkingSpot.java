package entities.impl;

import entities.ParkingSpot;
import enums.SpotType;

public class RegularParkingSpot extends ParkingSpot {
    public RegularParkingSpot(String levelId, String parkingLotId) {
        super(levelId, parkingLotId, SpotType.REGULAR);
    }
}
