package com.frankmoley.boot.essentials.initialbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServices {

    private RoomRepository roomRepository;

    @Autowired
    public RoomServices(final RoomRepository roomRepository) {
        super();
        this.roomRepository = roomRepository;
    }



    public List<Room> getRooms() {
        List<Room> rooms = new ArrayList<>();
        this.roomRepository.findAll().forEach(rooms::add);
        return rooms;
    }
}
