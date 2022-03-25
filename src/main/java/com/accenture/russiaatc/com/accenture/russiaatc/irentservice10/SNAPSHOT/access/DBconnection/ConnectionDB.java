package com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.access.DBconnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@Repository
public class ConnectionDB {


    //@Value("${user.login}")
    private final String USER;// = env.getProperty("user.login");// = "fijez";
    //@Value("${user.password}")
    private final String PASSWORD;// = env.getProperty("user.password");// = "forAccenture";
    //@Value("${url}")
    private final String URL;//= env.getProperty("url");// = "jdbc:h2:tcp://localhost/~/CityRentalSystem";// +
    private Connection connection;
            //System.getProperty("user.dir") +
           // "\\src\\main\\resources\\CityRentalSystem";
@Autowired
    public ConnectionDB(Environment env) throws SQLException
    {
        USER = env.getProperty("spring.datasource.login");
        PASSWORD = env.getProperty("spring.datasource.password");
        URL = env.getProperty("spring.datasource.url");
        System.out.println("dslkgjsd" + USER + " " + PASSWORD + " " + URL);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            DriverManager.registerDriver(new org.h2.Driver());
    }

    public Connection getConnection() {
        return connection;
    }
//    public static Connection connectionToDB() throws SQLException {
//        DriverManager.registerDriver(new org.h2.Driver());
//            return DriverManager.getConnection(URL, USER, PASSWORD);
//    }
}
