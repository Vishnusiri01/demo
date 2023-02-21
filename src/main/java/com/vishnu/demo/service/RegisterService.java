package com.vishnu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishnu.demo.entity.Student;
import com.vishnu.demo.repository.RegisterRepository;

@Service
public class RegisterService {
	@Autowired
	private RegisterRepository registerRepository;

	public void saveDetails(Student student) {
		registerRepository.save(student);
	}

}
