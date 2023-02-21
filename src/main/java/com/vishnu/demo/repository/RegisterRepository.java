package com.vishnu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishnu.demo.entity.Student;

@Repository
public interface RegisterRepository extends JpaRepository<Student, Integer>{

}
