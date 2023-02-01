package com.MappMany.ManyMapping.Controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MappMany.ManyMapping.Entities.Course;
import com.MappMany.ManyMapping.Entities.Student;
import com.MappMany.ManyMapping.dao.CourseRepo;
import com.MappMany.ManyMapping.dao.StudentRepo;



@RestController
@RequestMapping("/student/couse")
public class AppController {
	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private CourseRepo courseRepo;
	public AppController(StudentRepo studentRepo,
			CourseRepo courseRepo) {
		this.studentRepo=studentRepo;
		this.courseRepo=courseRepo;
	}
	
	@PostMapping
	public Student saveStudentWithCourse(@RequestBody Student student ) {
		return studentRepo.save(student);
	}
	@GetMapping
	public List<Student> findAllStudent(){
		return studentRepo.findAll();
	}
	@GetMapping("/{studentId}")
	public Student findStudent(@PathVariable int studentId) {
		return studentRepo.findById(studentId).orElse(null);
	}
	@GetMapping("/find/{name}")
	public List<Student> findStudentContainingByName(@PathVariable String name){
		return studentRepo.findByNameContaing(name);
	}
	@GetMapping("/search/{price}")
	public List<Course> findCourseLessThanPrice(@PathVariable double price){
		return courseRepo.findByFeeLessThan(price);
	}
}

