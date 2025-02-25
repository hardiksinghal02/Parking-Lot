package entities.impl;

import entities.ParkingSpot;
import enums.SpotType;

public class LargeParkingSpot extends ParkingSpot {
    public LargeParkingSpot(String levelId, String parkingLotId) {
        super(levelId, parkingLotId, SpotType.LARGE);
    }
}
