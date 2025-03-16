
package com.example.cabbooking.service;

import org.springframework.stereotype.Service;

@Service
public class FareCalculationService {
    public double calculateFare(int typeOfCab, double distance) {
        double ratePerKm = (typeOfCab == 1) ? 10.0 : 20.0;
        return ratePerKm * distance;
    }
}
