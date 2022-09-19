package com.emp.data.module;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	String id;
	String name;
	String gender;
	String qualification;
	String address;

	public Employee() {

	}
	public Employee(String id, String name, String gender, String qualification, String address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.qualification = qualification;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", gender=" + gender + ", qualification=" + qualification + ", address="
				+ address + "]";
	}

}
