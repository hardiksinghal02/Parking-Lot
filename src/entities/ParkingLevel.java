package entities;

import observe.Observable;
import observe.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkingLevel extends Observable {
    private String id;
    private final List<ParkingSpot> spots;

    private DisplayBoard displayBoard;

    public ParkingLevel(String id) {
        this.id = id;
        spots = new ArrayList<>();
    }

    public void setDisplayBoard(DisplayBoard displayBoard) {
        this.displayBoard = displayBoard;
    }

    public void addParkingSpot(ParkingSpot spot) {
        spots.add(spot);
    }

    public void bookSpot(ParkingSpot spot) {
        // logic for booking spot
        notifyObservers(spot.getSpotType(), -1);
    }

    public void vacateSpot(ParkingSpot spot) {
        // logic for vacating spot
        notifyObservers(spot.getSpotType(), 1);
    }
}
