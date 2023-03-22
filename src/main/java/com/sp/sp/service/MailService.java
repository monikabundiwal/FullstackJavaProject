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
	public String sendMailToVerifyEmailId(String emailId, String userType) throws Exception{
		MimeMessage mime = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime);
		helper.setTo(emailId);
		helper.setSubject("Activate your Email Account");
		String activationCode = ServiceUtil.getActivationCode();
		StringBuffer text = new StringBuffer();
		text.append("<h1>Please activate your email a/c by clicking the link below</h1>");
		text.append("<a href = 'http://localhost:8082/" + userType + "/verification/email/" + emailId + "/activationCode/" +activationCode + "'> Verify Your Email Account</a>");
		
		helper.setText(text.toString(), true);
		//helper.setText("<a href = 'http://localhost:8082/" + userType + "/email/verification/activationCode/" + activationCode + "'> Verify Your Email Account</a>");
		javaMailSender.send(mime);
		return activationCode;
	}
	
//    private String getActivationCode() {
//    	
//    }

}
