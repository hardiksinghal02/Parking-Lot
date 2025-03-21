package com.parkinglot.entities;

import com.parkinglot.enums.SpotType;
import lombok.Getter;

@Getter
public abstract class ParkingSpot {
    private String id;
    private String levelId;
    private String parkingLotId;
    private SpotType spotType;

    public ParkingSpot(String levelId, String parkingLotId, SpotType spotType) {
        this.levelId = levelId;
        this.parkingLotId = parkingLotId;
        this.spotType = spotType;
    }

    public String toString() {
        return id + ", " + levelId + ", " + parkingLotId + ", " + spotType;
    }
}
