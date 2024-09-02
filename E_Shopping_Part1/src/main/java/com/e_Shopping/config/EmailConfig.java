package com.e_Shopping.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailConfig {

	@Value("${spring.mail.username}")
	private String senderMailId;
	
	@Autowired
	JavaMailSender javaMailSender;
	
	public void sendMail(String to,String body,String subject)
	{
		
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(to);
		mailMessage.setSubject(subject);
		mailMessage.setText(body);
		mailMessage.setFrom(senderMailId);
	
		javaMailSender.send(mailMessage);
		
	}
}
