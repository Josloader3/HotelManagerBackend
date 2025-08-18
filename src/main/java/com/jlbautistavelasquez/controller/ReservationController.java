package com.jlbautistavelasquez.controller;

import com.jlbautistavelasquez.model.Reservation;
import com.jlbautistavelasquez.service.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getReservation(@PathVariable Integer id) throws Exception{
        Reservation obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Void> createReservation(@RequestBody Reservation reservation) throws Exception{
        Reservation obj = service.save(reservation);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
