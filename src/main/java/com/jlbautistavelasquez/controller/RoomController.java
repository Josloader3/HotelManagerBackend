package com.jlbautistavelasquez.controller;

import com.jlbautistavelasquez.model.Room;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @GetMapping
    public ArrayList<Room> getRooms(){
        return new ArrayList<>();
    }

    @PostMapping
    public void createRoom(){

    }

    @PutMapping("/{id}")
    public void updateRoom(@PathVariable Long id){

    }
}
