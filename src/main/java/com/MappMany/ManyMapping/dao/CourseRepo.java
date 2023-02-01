package com.MappMany.ManyMapping.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MappMany.ManyMapping.Entities.Course;

@Repository
public interface CourseRepo  extends JpaRepository<Course, Integer>{

	
	List<Course>findByFeeLessThan(double fee);
}
