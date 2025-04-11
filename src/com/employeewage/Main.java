package com.employeewage;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        int IS_PRESENT = 1;
        int WAGE_PER_HOUR = 20;
        int WORK_HOURS = 8;

        Random random = new Random();
        int empCheck = random.nextInt(2); // 0 or 1

        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is Present");

            // 👇 UC2 logic goes here:
            int dailyWage = WAGE_PER_HOUR * WORK_HOURS;
            System.out.println("Daily Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
