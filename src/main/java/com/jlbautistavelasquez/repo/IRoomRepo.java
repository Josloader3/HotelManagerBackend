package com.jlbautistavelasquez.repo;

import com.jlbautistavelasquez.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoomRepo extends JpaRepository<Room, Integer> {
}