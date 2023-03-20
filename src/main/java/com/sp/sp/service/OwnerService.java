package com.sp.sp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.sp.entity.Owner;
import com.sp.sp.repository.OwnerRepository;

@Service
public class OwnerService {
	    @Autowired
		private OwnerRepository ownerRepository;		
		public Owner save(Owner owner) 
		{
			return ownerRepository.save(owner);
		}
		
	}


