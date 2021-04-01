package com.example.demo.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private String message;
    private Boolean success;
    private Object object;

    public Result(String message, Boolean success) {
        this.message = message;
        this.success = success;
    }

}
