package com.rean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamAPIDay1 {

    public static void main(String[] args) {
        /*Stream.of("Rean", "Java 8", "Stream API")
                .forEach(System.out::println);*/

        List<Employee> employeeList = new EmployeeData().employees();
       /* List<Employee> employees = new ArrayList<>();
        for(Employee employee : employeeList) {
            if(employee.getFirstName().startsWith("M")){
                employees.add(employee);
            }
        }*/

        /*List<Employee> employees = employeeList.stream()
                .filter(employee -> employee.getFirstName().startsWith("M"))
                .collect(Collectors.toList());*/

        /*List<Employee> employees = employeeList.stream()
                .filter(employee -> employee.getWorkDept().equalsIgnoreCase("HR"))
                .collect(Collectors.toList());*/

        List<Employee> employees = employeeList.stream()
                .filter(employee -> employee.getSalary().compareTo(new BigDecimal(290_00)) >= 0)
                .collect(Collectors.toList());

        List<String> firstNames = employeeList.stream()
                .map(Employee::getFirstName)
                .filter(name -> name.equalsIgnoreCase("Maa"))
                .collect(Collectors.toList());

        System.out.println("Filter all employee by first name start with M: "  + firstNames);
    }
}
