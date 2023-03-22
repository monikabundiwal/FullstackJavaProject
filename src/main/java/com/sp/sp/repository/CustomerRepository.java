package com.sp.sp.repository;
import com.sp.sp.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import com.sp.sp.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	public Customer findByEmail(String email);
	

}
