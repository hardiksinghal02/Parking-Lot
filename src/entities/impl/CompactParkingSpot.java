package entities.impl;

import entities.ParkingSpot;
import enums.SpotType;

public class CompactParkingSpot extends ParkingSpot {
    public CompactParkingSpot(String levelId, String parkingLotId) {
        super(levelId, parkingLotId, SpotType.COMPACT);
    }
}
