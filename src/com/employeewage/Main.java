package com.employeewage;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        // Constants
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int WAGE_PER_HOUR = 20;

        // Random check
        Random random = new Random();
        int empCheck = random.nextInt(3); // 0 = Absent, 1 = Part Time, 2 = Full Time

        int empHours = 0;

        if (empCheck == IS_PART_TIME) {
            empHours = 4;
            System.out.println("Employee is Working Part Time");
        } else if (empCheck == IS_FULL_TIME) {
            empHours = 8;
            System.out.println("Employee is Working Full Time");
        } else {
            empHours = 0;
            System.out.println("Employee is Absent");
        }

        int dailyWage = empHours * WAGE_PER_HOUR;
        System.out.println("Daily Wage: " + dailyWage);
    }
}


