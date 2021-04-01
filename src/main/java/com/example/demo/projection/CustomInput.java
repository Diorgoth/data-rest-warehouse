package com.example.demo.projection;

import com.example.demo.entity.Currency;
import com.example.demo.entity.Input;
import com.example.demo.entity.Supplier;
import com.example.demo.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;


import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();

}
