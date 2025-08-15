package com.jlbautistavelasquez.service;

import com.jlbautistavelasquez.model.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation save(Reservation reservation) throws Exception;
    List<Reservation> findAll() throws Exception;
}