package com.example.cabbooking.controller;  

import com.example.cabbooking.model.Booking;
import com.example.cabbooking.service.CabBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController  
@RequestMapping("/cab")  
public class CabBookingController {

    @Autowired
    private CabBookingService cabBookingService;

    @PostMapping("/book")  
    public ResponseEntity<Booking> bookCab(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam int typeOfCab,
            @RequestParam double distance) {

        Booking booking = cabBookingService.bookCab(from, to, typeOfCab, distance);
        return ResponseEntity.ok(booking);
    }
}
