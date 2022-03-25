package com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.controller;

import com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.access.DTO.UserDTOImpl;
import com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.access.DaoConfiguration;
import com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.access.UserDao.OperationsDB;
import com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.model.entity.UserEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    //TODO получить данные текущего пользователя
    @GetMapping("/currentData")
    public UserEntity getUser(@RequestParam("login") String login) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DaoConfiguration.class);
        OperationsDB operationsDB= (OperationsDB)applicationContext.getBean("operationsDB");
        UserEntity user = operationsDB.selectUserByLogin(login);
        System.out.println(user.toString());
        return user;
    }
}
