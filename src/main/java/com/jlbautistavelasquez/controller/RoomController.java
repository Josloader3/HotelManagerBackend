package com.jlbautistavelasquez.controller;

import com.jlbautistavelasquez.model.Room;
import com.jlbautistavelasquez.service.IRoomService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @GetMapping("/{id}")
    public ResponseEntity<Room> getRoom(@PathVariable Integer id) throws Exception{
        Room obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Void> createRoom(@RequestBody Room room) throws Exception{
        Room obj = service.save(room);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Room> updateRoom(@RequestBody Room room, @PathVariable Integer id) throws Exception{
        Room obj = service.update(room, id);
        return ResponseEntity.ok().body(obj);
    }
}
