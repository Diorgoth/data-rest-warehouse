package com.example.demo.projection;

import com.example.demo.entity.User;
import com.example.demo.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;


import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {

     Integer getId();


    String getFirstName();


    String getLastName();


     String getPhoneNumber();


     String getCode();


     String getPassword();

     boolean isActive();


     Set<Warehouse> getWarehouses();
}
