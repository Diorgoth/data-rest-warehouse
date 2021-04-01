package com.example.demo.projection;

import com.example.demo.entity.Client;
import com.example.demo.entity.Currency;
import com.example.demo.entity.Output;
import com.example.demo.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;


import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {


    Integer getId();

    Timestamp getDate();


    Warehouse getWarehouse();


     Client getClient();


    Currency getCurrency();

     String getFactureNumber();


     String getCode();

}
