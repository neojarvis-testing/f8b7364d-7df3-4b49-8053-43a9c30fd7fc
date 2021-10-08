package com.examly.springapp.repository;

import com.examly.springapp.model.Room;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface RoomRepository extends CrudRepository<Room, Integer> {

    List<Room> findByAdminId(int adminId);

}