package com.jlbautistavelasquez.controller;

import com.jlbautistavelasquez.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @GetMapping
    public ArrayList<Reservation> getReservations(){
        return new ArrayList<>();
    }

    @PostMapping
    public void createReservation(){

    }
}
