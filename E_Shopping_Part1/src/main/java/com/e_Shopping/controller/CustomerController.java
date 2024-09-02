package com.e_Shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e_Shopping.config.EmailConfig;
import com.e_Shopping.model.CustomerDetails;
import com.e_Shopping.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	EmailConfig emailConfig;
	
	@RequestMapping("/")
	@ResponseBody
	public String greet()
	{
		return "HELLO MAMA";
	}
	
	@RequestMapping("/registrationPage")
	public String register()
	{
		return "RegistrationPage";
	}
	
	@RequestMapping("/storeData")
	public String storeData( CustomerDetails details)
	{
		CustomerDetails data = customerService.addData(details);
		if(data.getId()!=0)
		{
			emailConfig.sendMail(data.getEmail(), " Eyyuu Mail vachindhi MAMA!!! ", " MAMA nu paisal Katti java nundi mail ela pampalo nechukunnav ");
		}
		System.out.println(details.toString());
		return "login";
	}
	
	@RequestMapping("/loginPage")
	@ResponseBody
	public String login(String email, String password)
	{
		String verify = customerService.verify(email,password);
		return verify;
		
	}

}
