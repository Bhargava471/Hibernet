package com.mouritech.department.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name = "department_table")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "departmentid")
	private int deptId;
	
	@Column(name = "departmentname")
	@Size(min=3)
	private String deptName;
	
	@Column(name = "departmentbranch")
	@Size(min=3)
	private String deptBranch;
	
	@Column(name = "departmentlocation")
	@Size(min=3)
	private String deptLocation;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	
	public Department(String deptName, String deptBranch, String deptLocation) {
		super();
		this.deptName = deptName;
		this.deptBranch = deptBranch;
		this.deptLocation = deptLocation;
	}

	
	public Department(int deptId, String deptName, String deptBranch, String deptLocation) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptBranch = deptBranch;
		this.deptLocation = deptLocation;
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getDeptBranch() {
		return deptBranch;
	}


	public void setDeptBranch(String deptBranch) {
		this.deptBranch = deptBranch;
	}


	public String getDeptLocation() {
		return deptLocation;
	}


	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}


	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptBranch=" + deptBranch
				+ ", deptLocation=" + deptLocation + "]";
	}


	
	
	

}
