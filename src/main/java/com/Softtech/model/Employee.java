package com.Softtech.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity

public class Employee {
	@Id
	private Long empId;
	private String empName;
	private String empEmail;
	private String empMobile;
	private String empDesiganation;
	private Date empDob;
	private String empPan;
	private String empDeprt;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Salary salary;
	public Employee() {
		super();
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}
	public String getEmpDesiganation() {
		return empDesiganation;
	}
	public void setEmpDesiganation(String empDesiganation) {
		this.empDesiganation = empDesiganation;
	}
	public Date getEmpDob() {
		return empDob;
	}
	public void setEmpDob(Date empDob) {
		this.empDob = empDob;
	}
	public String getEmpPan() {
		return empPan;
	}
	public void setEmpPan(String empPan) {
		this.empPan = empPan;
	}
	public String getEmpDeprt() {
		return empDeprt;
	}
	public void setEmpDeprt(String empDeprt) {
		this.empDeprt = empDeprt;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empMobile="
				+ empMobile + ", empDesiganation=" + empDesiganation + ", empDob=" + empDob + ", empPan=" + empPan
				+ ", empDeprt=" + empDeprt + ", salary=" + salary + "]";
	}
	
	
}
