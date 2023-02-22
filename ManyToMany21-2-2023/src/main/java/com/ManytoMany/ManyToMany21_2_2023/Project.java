package com.ManytoMany.ManyToMany21_2_2023;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project 
{
     @Id @Column(name="project_id") //@id is use to create the primary key
	private int Pro_id;
	private String Pro_name;
	@ManyToMany (mappedBy="project")//Annotation use for mapping Department and Employee table
	private List<Employee>employee;
	//create the getter and setter method
	public int getPro_id() {
		return Pro_id;
	}
	public void setPro_id(int pro_id) {
		Pro_id = pro_id;
	}
	public String getPro_name() {
		return Pro_name;
	}
	public void setPro_name(String pro_name) {
		Pro_name = pro_name;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	//create constructor from getter and setter
	public Project(int pro_id, String pro_name, List<Employee> employee) {
		super();
		Pro_id = pro_id;
		Pro_name = pro_name;
		this.employee = employee;
	}
	//generate object for super class
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
