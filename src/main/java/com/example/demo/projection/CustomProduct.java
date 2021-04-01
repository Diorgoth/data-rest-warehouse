package com.example.demo.projection;

import com.example.demo.entity.Attachment;
import com.example.demo.entity.Category;
import com.example.demo.entity.Measurement;
import com.example.demo.entity.Product;
import org.springframework.data.rest.core.config.Projection;



@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    Category getCategory();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurement();

}
