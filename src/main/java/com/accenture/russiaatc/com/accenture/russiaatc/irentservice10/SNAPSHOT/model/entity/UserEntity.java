package com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.model.entity;


public interface UserEntity {

    public double getCash();

    public String getLogin();

    public String getPassword();

    public int getId();

    public String getFirst_name();

    public String getLast_name();

    public Access getAccess();

    public void setId(int id);

    public void setCash(Double cash);

    public void setLogin(String login);

    public void setPassword(String password);

    public void setFirst_name(String first_name);

    public void setLast_name(String last_name);

    public void setAccess(Access access);
}
