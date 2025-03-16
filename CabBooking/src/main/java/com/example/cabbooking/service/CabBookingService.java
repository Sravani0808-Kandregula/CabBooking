package com.example.cabbooking.service;  

import com.example.cabbooking.model.Booking;
import com.example.cabbooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabBookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking bookCab(String from, String to, int typeOfCab, double distance) {
        double ratePerKm = (typeOfCab == 1) ? 10.0 : 20.0;
        double fare = ratePerKm * distance;

        Booking booking = new Booking(from, to, typeOfCab, distance, fare);
        return bookingRepository.save(booking);
    }
}
