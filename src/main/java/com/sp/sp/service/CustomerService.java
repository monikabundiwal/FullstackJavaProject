package com.sp.sp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.sp.entity.Customer;
import com.sp.sp.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private MailService mailService;
	
	public Customer save(Customer customer) throws Exception {
		//db service
		customer = customerRepository.save(customer);
		//mail service
		 String activationCode = mailService.sendMailToVerifyEmailId(customer.getEmail(), "customer");
		customer.setActivationCode(activationCode);
		customerRepository.save(customer);
		return customer;
	}
	
	public Customer update(Customer customer) throws Exception {
		customer = customerRepository.save(customer);
		
		return customer;
	}
	
	  public Customer findByEmail(String email) {
		return customerRepository.findByEmail(email);
	}
	
}


