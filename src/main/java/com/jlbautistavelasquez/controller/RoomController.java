package com.jlbautistavelasquez.controller;

import com.jlbautistavelasquez.model.Room;
import com.jlbautistavelasquez.service.IRoomService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
@AllArgsConstructor
public class RoomController {

    private IRoomService service;

    @GetMapping
    public ResponseEntity<List<Room>> getRooms() throws Exception{
        List<Room> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Room> createRoom(@RequestBody Room room) throws Exception{
        Room obj = service.save(room);
        return ResponseEntity.ok().body(obj);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Room> updateRoom(@RequestBody Room room, @PathVariable Integer id) throws Exception{
        Room obj = service.update(room, id);
        return ResponseEntity.ok().body(obj);
    }
}
