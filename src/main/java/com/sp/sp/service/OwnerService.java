package com.sp.sp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.sp.entity.Customer;
import com.sp.sp.entity.Owner;
import com.sp.sp.repository.OwnerRepository;

@Service
public class OwnerService {
	    @Autowired
		private OwnerRepository ownerRepository;		
		@Autowired
		private MailService mailService;
		
		public Owner save(Owner owner) throws Exception {
			owner = ownerRepository.save(owner);
			String activationCode = mailService.sendMailToVerifyEmailId(owner.getEmail(), "owner");
			owner.setActivationCode(activationCode);
			ownerRepository.save(owner);
			return owner;
		}
		
		public Owner update(Owner owner) throws Exception {
			owner = ownerRepository.save(owner);
			
			return owner;
		}
		
		  public Owner findByEmail(String email) {
			return ownerRepository.findByEmail(email);
		}
	}


