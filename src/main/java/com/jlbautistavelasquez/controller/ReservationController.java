package com.jlbautistavelasquez.controller;

import com.jlbautistavelasquez.model.Reservation;
import com.jlbautistavelasquez.service.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@AllArgsConstructor
public class ReservationController {

    private IReservationService service;

    @GetMapping
    public ResponseEntity<List<Reservation>> getReservations() throws Exception{
        List<Reservation> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation) throws Exception{
        Reservation obj = service.save(reservation);
        return ResponseEntity.ok().body(obj);
    }
}
