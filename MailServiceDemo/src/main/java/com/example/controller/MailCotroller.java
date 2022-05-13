package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.impl.EmailServiceImpl;

@Controller
@RequestMapping("/mail")
public class MailCotroller {
	@Autowired
	EmailServiceImpl mail;
	
	@PostMapping({ "/send" })
	public ResponseBody getProductByPName(@PathVariable String to, String subject, String text) {
		mail.sendSimpleMessage(to,subject,text);
		return null;
		
	}
	

}
