package com.example.javamvc.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Forecast {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    public Integer id;
    public String date;
   public String temperature;
   public String city;
   public int userId;


    public Forecast(String date, String temperature, String city, int userId) {
        this.date = date;
        this.temperature = temperature;
        this.city = city;
        this.userId = userId;

    }
    public Forecast() {

    }
}
