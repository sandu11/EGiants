package com.empl.entity;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity 
@Table(name="emp")
public class Employee{
	
	@Id
	@Column(name="empid")
	private int empid;
	
	@Column(name="empname")
	private String empname;
	
	@Column(name="empsal")
	private float empsal;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="company_id")
	private Company company;
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	public Employee(int empid, String empname, float empsal, Company company) {
		
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.company = company;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public float getEmpsal() {
		return empsal;
	}

	public void setEmpsal(float empsal) {
		this.empsal = empsal;
	}
	
	

}
