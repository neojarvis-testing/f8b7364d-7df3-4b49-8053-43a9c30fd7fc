package com.examly.springapp.service; 

import org.springframework.stereotype.Service;

import com.examly.springapp.model.Admin;
import com.examly.springapp.model.Login;
import com.examly.springapp.model.Room;

import com.examly.springapp.model.User;
import com.examly.springapp.repository.RoomRepository;
import com.examly.springapp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private AdminRepository adminRepository;

    public Room addRoom(Room room){
        return roomRepository.save(room);
    }

    public Room editRoom(Room room){
        return roomRepository.save(room);
    }

    public void deleteRoom(int id){
        roomRepository.deleteById(id);
    }

    public void bookRoom(int id){
        Room room = roomRepository.findById(id).get();
        room.setStatus("BOOKED");
        roomRepository.save(room);
    }

    public List<Room> getRooms(String email){
        return roomRepository.findByAdminId(adminRepository.findByEmail(email).getId());
    }

    

}
