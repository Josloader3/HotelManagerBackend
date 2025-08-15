package com.jlbautistavelasquez.service;

import com.jlbautistavelasquez.model.Room;
import com.jlbautistavelasquez.repo.IRoomRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements IRoomService{

    private final IRoomRepo repo;

    @Override
    public Room save(Room room) throws Exception {
        return repo.save(room);
    }

    @Override
    public Room update(Room room, Integer id) throws Exception {
        room.setId(id);
        return repo.save(room);
    }

    @Override
    public List<Room> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Room findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Room());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
