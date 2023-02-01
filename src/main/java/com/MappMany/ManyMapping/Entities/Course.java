package com.MappMany.ManyMapping.Entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	@Column(name = "Title")
	private String title;
	@Column(name = "Abbreviation")
	private String abbreviation;
	@Column(name = "Modules")
	private int modules;
	@Column(name = "Fee")
	private double fee;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String title, String abbreviation, int modules, double fee) {
		super();
		this.id = id;
		this.title = title;
		this.abbreviation = abbreviation;
		this.modules = modules;
		this.fee = fee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public int getModules() {
		return modules;
	}
	public void setModules(int modules) {
		this.modules = modules;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@ManyToMany(mappedBy = "course",fetch = FetchType.LAZY)
	private Set<Student> student;
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> student) {
		this.student = student;
	}

}

