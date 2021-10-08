package com.examly.springapp.model;

import javax.persistence.Entity;
import com.examly.springapp.model.Room;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="Booking")
public class Booking {

    @Id
    @GeneratedValue
    int id;

    int userId;

    String price;

    int roomId;

    String hotelName;

    String hotelImageURL;

    String hotelAddress;

    int adminId;

}
