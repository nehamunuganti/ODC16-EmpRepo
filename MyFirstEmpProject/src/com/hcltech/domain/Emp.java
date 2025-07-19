package com.hcltech.domain;

public class Emp {
	private int empId;
	private String empname;
	private double empSal;
	public Emp(int empId, String empname, double empSal) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empSal = empSal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empname=" + empname + ", empSal=" + empSal + "]";
	}
	
}
