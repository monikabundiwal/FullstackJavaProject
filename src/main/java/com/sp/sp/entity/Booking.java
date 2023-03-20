package com.sp.sp.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
	@Id
	private Integer id;
	private Date date;
	
	@ManyToOne
	private SwimmingPool swimmingPool;
	@ManyToOne
	private Customer customer;

}

//multiple booking by the same customer
//multiple booking under one swimming pool