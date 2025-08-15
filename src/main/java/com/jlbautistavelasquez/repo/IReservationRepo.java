package com.jlbautistavelasquez.repo;

import com.jlbautistavelasquez.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReservationRepo extends JpaRepository<Reservation, Integer> {
}