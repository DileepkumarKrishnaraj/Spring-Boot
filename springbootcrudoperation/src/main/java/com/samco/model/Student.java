package com.samco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_marks") 
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stu_id")
	private int stuId;
	@Column(name = "stu_name")
	private String stuName;
	@Column(name = "stu_dep")
	private String stuDep;
	@Column(name = "total_marks")
	private int stuMarks;
	
	public Student(String stuName, String stuDep, int stuMarks) {
		super();
		this.stuName = stuName;
		this.stuDep = stuDep;
		this.stuMarks = stuMarks;
	}
	
	public Student() {
		super();
	}
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuDep() {
		return stuDep;
	}
	public void setStuDep(String stuDep) {
		this.stuDep = stuDep;
	}
	public int getStuMarks() {
		return stuMarks;
	}
	public void setStuMarks(int stuMarks) {
		this.stuMarks = stuMarks;
	}
	
}
