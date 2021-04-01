package com.example.demo.projection;

import com.example.demo.constants.ExpireStatus;
import com.example.demo.entity.Input;
import com.example.demo.entity.InputProduct;
import com.example.demo.entity.Product;
import org.springframework.data.rest.core.config.Projection;


import java.sql.Date;

@Projection(types = InputProduct.class)
public interface CustomInputproduct {


      Integer getId();

      Product getProduct();

      Double getAmount();

     Double getPrice();

     Date getExpireDate();

     Input getInput();

     ExpireStatus getExpireStatus();

}
