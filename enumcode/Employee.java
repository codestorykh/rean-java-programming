package com.learningjava.enumcode;

public class Employee {

	private String name;
	private Integer age;
	private Double salary;
	private Department department;


	public Employee() {
		
	}
	public Employee(String name, Integer age, Double salary, Department department) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	public String toString() {
		return "Employee Name:" + this.name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		
		this.department = department;
	}
	
}
