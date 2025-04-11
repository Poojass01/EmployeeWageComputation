package com.employeewage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        EmployeeWageBuilder wageBuilder = new EmployeeWageBuilder();
        wageBuilder.computeWage();
    }
}
