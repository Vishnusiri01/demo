package com.vishnu.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishnu.demo.costant.Appconstant;
import com.vishnu.demo.entity.Student;
import com.vishnu.demo.service.RegisterService;
@RestController
@RequestMapping(value=Appconstant.FORWARD_SLASH)
public class RegisterController  {
	
	@Autowired
	private RegisterService registerService;
	
	@PostMapping(value=Appconstant.SAVE_STUDENT_DETAILS)
	public void saveRegisterDetails(@RequestBody Student student) {
		registerService.saveDetails(student); 
		
	}

}
