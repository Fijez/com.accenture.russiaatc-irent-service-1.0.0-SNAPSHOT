package com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.model;

import com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.model.entity.AdminEntity;
import com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.model.entity.TenantEntity;
import com.accenture.russiaatc.com.accenture.russiaatc.irentservice10.SNAPSHOT.model.entity.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Configuration
public class ModelConfiguration {

//    @Bean
//    @Scope(value = "prototype")
    //@SessionScope
    public UserEntity adminEntity(){
        System.out.println("creation adminEntity");
        return new AdminEntity();
    }

//    @Bean
//    @Scope(value = "prototype")
    //@SessionScope
    public UserEntity tenantEntity(){
        System.out.println("creation userEntity");
        return new TenantEntity();
    }

//    @Bean
//    @Scope("prototype")
//    public Coordinates coordinates() {
//        return new Coordinates();
//    }
}
