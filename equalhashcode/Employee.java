package com.learningjava.equalhashcode;

public class Employee {

	private String name;
	private Integer age;

	public Employee(String name, Integer age) {
		this.name = name;
		this.age = age;
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

	public String toString() {

		return "Employee name " + this.name + " Age " + this.age;
	}

	/**
	 * equals used to in EqualsNHashCode1
	 */

	/*
	 * @Override public boolean equals(Object obj) { if (obj == this) { return true;
	 * } if (!(obj instanceof Employee)) { return false; } Employee empObj =
	 * (Employee) obj; return this.age == empObj.age &&
	 * this.name.equalsIgnoreCase(empObj.name); }
	 */

	/**
	 *  hashCode
	 */

	@Override
	public int hashCode() {
		int hash = 1;
		hash = hash * 17 + this.name.hashCode();
		hash = hash * 31 + this.age;
		return hash;
	}

}
