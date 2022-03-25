package com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.access.DTO;

import com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.model.entity.Access;

public class UserDTOImpl implements UserDTO {
    private String login;//e-mail
    private String password;
    private String first_name;
    private String last_name;
    private Access access;
    private Double cash;
    private Class<? extends Transport> transport;

    public UserDTOImpl(String login, String password, String first_name,
                       String last_name, Access access, double cash) {
        this.login = login;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.access = access;
        this.cash = cash;
    }

    public UserDTOImpl() {

    }

    public void setTransport(Class<? extends Transport> transport) {
        this.transport = transport;
    }

    public Class<? extends Transport> getTransport() {
        return transport;
    }

    @Override
    public double getCash() {
        return cash;
    }

    @Override
    public String getLogin() {
        return this.login;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getFirst_name() {
        return this.first_name;
    }

    @Override
    public String getLast_name() {
        return this.last_name;
    }

    @Override
    public Access getAccess() {
        return this.access;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Override
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public void setAccess(Access access) {
        this.access = access;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Admin{" +
                " login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", com.davydenko.access=" + access +
                ", cash=" + cash +
        //", service.transport=" + service.transport +
                '}';
    }
}
