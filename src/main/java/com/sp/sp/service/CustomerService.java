package com.sp.sp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.sp.entity.Customer;
import com.sp.sp.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
//	@Autowired
//	private MailService mailService;
	
//	public Customer save(Customer customer) throws Exception {
//		customer = customerRepository.save(customer);
//		mailService.sendMailToVerifyEmailId(customer.getEmail(), "customer");
//		return customer;
	
	
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}
	}


