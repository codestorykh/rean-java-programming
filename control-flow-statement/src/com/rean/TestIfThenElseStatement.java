package com.rean;

public class TestIfThenElseStatement {

    public boolean checkingUserStatus(String input) {
        if("A".equalsIgnoreCase(input)) {
            return true;
        }
        throw new IllegalStateException();
    }

    public double calculator(double a, double b, String remark) {
        if("add".equalsIgnoreCase(remark)) {
            return a + b;
        }else if("sub".equalsIgnoreCase(remark)) {
            return a - b;
        }else if("div".equalsIgnoreCase(remark)) {
            return a / b;
        }else if("mul".equalsIgnoreCase(remark)) {
            return a * b;
        }else
            throw new IllegalArgumentException();

    }

    public double calculatorSwitchCase(double a, double b, String remark) {
        return switch (remark) {
            case "add", "sum", "+" -> a + b;
            case "sub", "-" -> a - b;
            case "div", "/" -> a / b;
            case "mul", "*" -> a * b;
            default ->  throw new IllegalArgumentException();
        };
    }

    public static void main(String[] args) {
       /* TestIfThenElseStatement t = new TestIfThenElseStatement();
        boolean userStatus = t.checkingUserStatus("B");
        System.out.println(userStatus);*/
        System.out.println();
        TestIfThenElseStatement test = new TestIfThenElseStatement();
       /* double result = test.calculator(2, 2, "mul");
        System.out.println(result);*/
        double result = test.calculatorSwitchCase(2, 3, "*");
        System.out.println(result);
    }
}
