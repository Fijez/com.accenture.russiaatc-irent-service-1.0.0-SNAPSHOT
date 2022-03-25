package com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.access.DTO;

import com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.model.entity.Condition;

public abstract class Transport {

//    private static List<Transport> transportList = new ArrayList<>();

    private double id;
    private Condition condition;
    private double maxSpeed;

//    public static List<Transport> getTransportList() {
//        return transportList;
//    }


    public void setId(double id) {
        this.id = id;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getId() {
        return id;
    }

    public Class<? extends Transport> getTypeTransport() {
        return this.getClass();
    }

    public Condition getCondition() {
        return condition;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

}
