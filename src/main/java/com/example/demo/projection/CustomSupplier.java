package com.example.demo.projection;

import com.example.demo.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {


    Integer getId();

    String getName();

    boolean isActive();

    String getPhoneNumber();

}
