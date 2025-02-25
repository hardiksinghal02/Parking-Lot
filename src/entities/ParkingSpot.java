package entities;

import enums.SpotType;

public abstract class ParkingSpot {
    private String id;
    private String levelId;
    private String parkingLotId;
    private SpotType spotType;

    public ParkingSpot(String levelId, String parkingLotId, SpotType spotType) {
        this.levelId = levelId;
        this.parkingLotId = parkingLotId;
    }

    public SpotType getSpotType() {
        return spotType;
    }
}
