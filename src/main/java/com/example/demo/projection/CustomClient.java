package com.example.demo.projection;

import com.example.demo.entity.Client;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Client.class)
public interface CustomClient {

    Integer getId();

    String getName();

    boolean isActive();

    String getPhoneNumber();

}
