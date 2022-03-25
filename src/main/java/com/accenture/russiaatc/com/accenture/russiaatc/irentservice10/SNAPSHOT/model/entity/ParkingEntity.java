package com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.model.entity;

import com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.model.utils.Coordinates;

import java.util.List;

public class ParkingEntity {

    double id;
    Coordinates coordinates;
    double parkingRadius;
    TransportTypes transportTypes;
    List<? extends Transport> transports;
    String address;

    public ParkingEntity() {
    }

    public ParkingEntity(double id, Coordinates coordinates,
                         double parkingRadius,
                         TransportTypes transportTypes,
                         String address) {
        this.id = id;
        this.coordinates = coordinates;
        this.parkingRadius = parkingRadius;
        this.transportTypes = transportTypes;
        this.address = address;
    }

    public List<? extends Transport> getTransports() {
        return transports;
    }

    public void setTransports(List<? extends Transport> transports) {
        this.transports = transports;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public double getParkingRadius() {
        return parkingRadius;
    }

    public void setParkingRadius(double parkingRadius) {
        this.parkingRadius = parkingRadius;
    }

    public TransportTypes getTransportTypes() {
        return transportTypes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTransportTypes(TransportTypes transportTypes) {
        this.transportTypes = transportTypes;
    }
}
