package com.rean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeData {

    public List<Employee> employees () {

       return Arrays.asList(
                new Employee(1, 123456, "Jala", "Maka", "F", "HR",
                        new BigDecimal(260_00)),
                new Employee(2, 1234567, "Mala", "Sla", "F", "HR",
                        new BigDecimal(250_00)),
                new Employee(3, 1234568, "Maa", "Lala", "M", "HR",
                        new BigDecimal(290_00)),
                new Employee(4, 1234569, "Maa", "KiKo", "M", "IT",
                        new BigDecimal(295_00))
        );
    }
}
