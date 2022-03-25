package com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.access.DTO;
import com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.model.entity.Access;


public interface UserDTO {

//    public int getId();
//
//    public int setId();

    public double getCash();

    public String getLogin();

    public String getPassword();

    public String getFirst_name();

    public String getLast_name();

    public Access getAccess();

    public void setCash(Double cash);

    public void setLogin(String login);

    public void setPassword(String password);

    public void setFirst_name(String first_name);

    public void setLast_name(String last_name);

    public void setAccess(Access access);
}
