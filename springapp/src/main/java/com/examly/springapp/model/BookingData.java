package com.examly.springapp.model;

import com.examly.springapp.model.Room;
import com.examly.springapp.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingData {

    int bookingId;

    int userId;

    String price;

    int roomId;

    int adminId;

}
