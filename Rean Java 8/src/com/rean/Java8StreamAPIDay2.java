package com.rean;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamAPIDay2 {

    public static void main(String[] args) {

        List<Employee> employees = new EmployeeData().employees();

        //Map
        /*employees.stream()
                .map(Employee::getGender)
                .forEach(System.out::println);*/
        //FlatMap
        /*List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<Integer> flatMaps = nums.stream()
                .flatMap(num -> Stream.of(1+num, num))
                .collect(Collectors.toList());
        System.out.println("FlatMap" + flatMaps);
*/
        //Filter
        /*List<Employee> employees1 = employees.stream()
                .filter(employee -> employee.getEmployeeId() == 123456)
                .collect(Collectors.toList());
        System.out.println("Employee " + employees1);*/
        //Unique Elements
    /*    List<String> genders = employees.stream()
                .map(Employee::getGender)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique Elements" + genders);*/
        //Limiting
        /*List<Employee> employees1 = employees.stream()
                .filter(employee -> employee.getWorkDept().equalsIgnoreCase("HR"))
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("Employee" + employees1);*/

        //Skip
       /* List<Employee> employees1 = employees.stream()
                .filter(employee -> employee.getWorkDept().equalsIgnoreCase("HR"))
                .skip(1)
                .collect(Collectors.toList());
        System.out.println("Employee" + employees1);*/

        //Sorting
       /* List<Integer> id = employees.stream()
                .map(Employee::getId)
                .sorted(Comparator.reverseOrder())
                //.sorted()
                .collect(Collectors.toList());
        System.out.println(id);*/

        List<Integer> id1 = employees.stream()
                .sorted(Comparator.comparing(Employee::getFirstName)
                        .reversed()
                        .thenComparing(Employee::getLastNam))
                .map(Employee::getId)
                .collect(Collectors.toList());
        System.out.println(id1);
    }
}
