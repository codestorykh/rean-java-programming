package com.rean;

import java.math.BigDecimal;

public class Employee {

    private Integer id;
    private Integer employeeId;
    private String firstName;
    private String lastNam;
    private String gender;
    private String workDept;
    private BigDecimal salary;

    public Employee() {
    }

    public Employee(Integer id, Integer employeeId, String firstName, String lastNam, String gender, String workDept, BigDecimal salary) {
        this.id = id;
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastNam = lastNam;
        this.gender = gender;
        this.workDept = workDept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastNam='" + lastNam + '\'' +
                ", gender='" + gender + '\'' +
                ", workDept='" + workDept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNam() {
        return lastNam;
    }

    public void setLastNam(String lastNam) {
        this.lastNam = lastNam;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWorkDept() {
        return workDept;
    }

    public void setWorkDept(String workDept) {
        this.workDept = workDept;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
