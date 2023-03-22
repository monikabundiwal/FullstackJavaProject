package com.sp.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.sp.entity.Customer;
import com.sp.sp.service.CustomerService;

@RestController
@RequestMapping("customer")
@CrossOrigin
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public ResponseEntity<Customer> save (@RequestBody Customer customer) throws Exception
	{
		return ResponseEntity.ok(customerService.save(customer));
	}
	//DTO: Data Transfer Object 
	@GetMapping("verification/email/{email}/activationCode/{activationCode}")
	public String emailVerification(@PathVariable String email, @PathVariable String activationCode) throws Exception
	{
		String message = "Not verified.";
	    Customer customer = customerService.findByEmail(email);
		if(activationCode.equals(customer.getActivationCode()))
		{
			message = "<h1>Your email account verified successfully</h1>";
			customer.setStatus(1);
			customerService.update(customer);
		}
	
	return message;

}
}