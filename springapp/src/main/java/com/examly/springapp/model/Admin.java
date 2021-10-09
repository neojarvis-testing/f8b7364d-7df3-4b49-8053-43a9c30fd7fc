package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Admin {

    @Id
    @GeneratedValue
    int id;

    String email;

    String password;

    String mobileNumber;

    String sellerName;

    String userRole;

    String hotelName;

    String hotelImageURL;

    String hotelAddress;

    int earnings;
}
