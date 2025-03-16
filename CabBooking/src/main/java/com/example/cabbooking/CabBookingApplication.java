package com.example.cabbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CabBookingApplication {
    public static void main(String[] args) {
        SpringApplication.run(CabBookingApplication.class, args);
        System.out.println("🚖 Cab Booking Microservice is Running on Port 8080!");
    }
}
