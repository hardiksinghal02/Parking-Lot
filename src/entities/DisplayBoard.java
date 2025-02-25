package entities;

import enums.SpotType;
import observe.Observer;

import java.util.HashMap;
import java.util.Map;

public class DisplayBoard extends Observer {
    Map<SpotType, Integer> availableSpots;

    public DisplayBoard(ParkingLevel parkingLevel) {
        super(parkingLevel);
        availableSpots = new HashMap<>();
        parkingLevel.addObserver(this);
    }

    @Override
    public void update(SpotType spotType, Integer bookingCount) {
        availableSpots.put(spotType, availableSpots.getOrDefault(spotType, 0) + bookingCount);
    }
}
