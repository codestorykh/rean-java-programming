package com.codestroykh.enumeration;

public enum EnumWithConstructor {

	 HR(1, "DEPT-01"), OPERATIONS(2, "DEPT-02"), LEGAL(3, "DEPT-03"), MARKETING(4, "DEPT-04");

	EnumWithConstructor(Integer deptID, String deptCode) {
		this.deptID = deptID;
		this.deptCode = deptCode;
	}
	
	EnumWithConstructor(String deptCode) {
		this.deptCode = deptCode;
	}

	private final String deptCode;
	private Integer deptID;

	public String getDeptCode() {
		return deptCode;
	}
	
	public Integer getDeptID() {
		return deptID;
	}
}
