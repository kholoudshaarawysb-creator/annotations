package com.example.annotations.User;

import com.example.annotations.annotation.flfl;
import com.example.annotations.annotation.shata;
import org.springframework.stereotype.Component;

@Component
public class Userr {
   private String name;

    @flfl
    public void setName(String name) {
        this.name = name;
    }

    @shata
    public String getName() {
        return name;
    }
}
