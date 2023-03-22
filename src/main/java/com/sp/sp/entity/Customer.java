package com.sp.sp.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Customer {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Long mobileNumber;
	private String email;
	private String password;
	private String activationCode;
	private int status = 0;
	
	@OneToMany(mappedBy = "customer")
	private Set<Booking> bookings = new HashSet<>();

}
//one customer multiple booking
//to avoid foreign key