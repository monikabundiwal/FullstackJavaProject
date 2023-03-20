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
public class Owner {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Long mobileNumber;
	private String email;
	private String password;
	@OneToMany(mappedBy = "owner")
	private Set<SwimmingPool> swimmingPools = new HashSet<>();
	

}
//one owner have multiple swimming pool