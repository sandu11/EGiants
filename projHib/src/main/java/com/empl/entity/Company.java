package com.empl.entity;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="company")
public class Company{
	
	@Id
	@Column(name="company_id")
	private int companyid;
	
	@Column(name="comname")
	private String comname;
	
	@Column(name="comdept")
	private String comdept;
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="company")
	private Set<Employee> employee;


	public Company(int companyid, String comname, String comdept) {
		
		this.companyid = companyid;
		this.comname = comname;
		this.comdept = comdept;
	}

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}

	public int getCompanyid() {
		return companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

	public String getComname() {
		return comname;
	}

	public void setComname(String comname) {
		this.comname = comname;
	}

	public String getComdept() {
		return comdept;
	}

	public void setComdept(String comdept) {
		this.comdept = comdept;
	}
	
	
	

}
