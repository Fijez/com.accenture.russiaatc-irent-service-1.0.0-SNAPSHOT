package com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.access.DTO;

import java.sql.Time;

public class RentDTO {
    Class <? extends Transport> transport;
    Time startRent;
    Time endRent;
    boolean rentStatus;

    public Class<? extends Transport> getTransport() {
        return transport;
    }

    public Time getStartRent() {
        return startRent;
    }

    public Time getEndRent() {
        return endRent;
    }

    public boolean isRent() {
        return rentStatus;
    }
}
