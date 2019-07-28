package com.Softtech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Salary{
	@Id
	@GeneratedValue
	private Long salId;
	private double baisc;
	private double houseRent;
	private double medical;
	private double special;
	private double pf; //ded
	private double others; //ded
	private double grossSal;
	private double total; //netSalaary
	public Salary() {
		super();
	}
	public Long getSalId() {
		return salId;
	}
	public void setSalId(Long salId) {
		this.salId = salId;
	}
	public double getBaisc() {
		return baisc;
	}
	public void setBaisc(double baisc) {
		this.baisc = baisc;
	}
	public double getHouseRent() {
		return houseRent;
	}
	public void setHouseRent(double houseRent) {
		this.houseRent = houseRent;
	}
	public double getMedical() {
		return medical;
	}
	public void setMedical(double medical) {
		this.medical = medical;
	}
	public double getSpecial() {
		return special;
	}
	public void setSpecial(double special) {
		this.special = special;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getOthers() {
		return others;
	}
	public void setOthers(double others) {
		this.others = others;
	}
	public double getGrossSal() {
		return grossSal;
	}
	public void setGrossSal(double grossSal) {
		this.grossSal = grossSal;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Salary [salId=" + salId + ", baisc=" + baisc + ", houseRent=" + houseRent + ", medical=" + medical
				+ ", special=" + special + ", pf=" + pf + ", others=" + others + ", grossSal=" + grossSal + ", total="
				+ total + "]";
	}
	
	
	
	// GS=basic+houseRent+medical+special
	//	netSal=GS-(pf+others);
	
	
}
