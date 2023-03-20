package com.sp.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.sp.entity.Owner;
import com.sp.sp.service.OwnerService;

@RestController
@RequestMapping("owner")
@CrossOrigin
public class OwnerController {
	@Autowired
	private OwnerService ownerService;
	@PostMapping
	public ResponseEntity<Owner> save(@RequestBody Owner owner){
		System.out.println(owner.getFirstName());
		return ResponseEntity.ok(ownerService.save(owner));
	}

}
