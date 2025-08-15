package com.jlbautistavelasquez.service;

import com.jlbautistavelasquez.model.Reservation;
import com.jlbautistavelasquez.repo.IReservationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservationService{

    private final IReservationRepo repo;

    @Override
    public Reservation save(Reservation reservation) throws Exception {
        return repo.save(reservation);
    }

    @Override
    public List<Reservation> findAll() throws Exception {
        return repo.findAll();
    }
}
