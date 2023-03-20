package com.sp.sp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service

public class MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	public boolean sendMailToVerifyEmailId(String emailId, String userType) throws Exception{
		MimeMessage mime = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime);
		helper.setTo(emailId);
		helper.setSubject("Activate your EmailAccount");
		String activationCode = ServiceUtil.getActivationCode();
		helper.setText("<h1>Please activate your email bu clicking the link below</h1>", true);
		helper.setText("<a href = 'http://localhost:8082" + userType + "/email/verification/activationCode/" + activationCode + "'> Verify Your Email Account</a>");
		javaMailSender.send(mime);
		return true;
	}
	


}
