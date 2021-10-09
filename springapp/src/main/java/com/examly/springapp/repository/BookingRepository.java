package com.examly.springapp.repository;

import com.examly.springapp.model.Booking;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BookingRepository extends CrudRepository<Booking, Integer> {


    List<Booking> findByAdminId(int adminId);

    List<Booking> findByUserId(int userId); 


}