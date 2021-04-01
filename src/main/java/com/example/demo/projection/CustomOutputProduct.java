package com.example.demo.projection;

import com.example.demo.entity.Output;
import com.example.demo.entity.OutputProduct;
import com.example.demo.entity.Product;
import org.springframework.data.rest.core.config.Projection;



@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {



    Integer getId();

     Product getProduct();

     Double getAmount();

     Double getPrice();

     Output getOutput();


}
