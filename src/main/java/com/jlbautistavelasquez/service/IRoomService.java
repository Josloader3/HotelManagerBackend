package com.jlbautistavelasquez.service;

import com.jlbautistavelasquez.model.Room;

import java.util.List;

public interface IRoomService {
    Room save(Room room) throws Exception;
    Room update(Room room, Integer id) throws Exception;
    List<Room> findAll() throws Exception;
    Room findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}
