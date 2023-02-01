package com.MappMany.ManyMapping.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MappMany.ManyMapping.Entities.Student;



@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	List<Student>findByNameContaing(String name);
}
