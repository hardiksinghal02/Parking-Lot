package com.parkinglot.entities;

import com.parkinglot.entities.impl.EntryGate;
import com.parkinglot.entities.impl.ExitGate;

import java.util.List;

public abstract class ParkingLot {
    private String id;
    private String name;
    private String address;
    List<ParkingLevel> levels;
    List<EntryGate> entryGates;
    List<ExitGate> exitGates;

    public ParkingLot(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
