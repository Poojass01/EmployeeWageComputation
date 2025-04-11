package com.employeewage;

import java.util.Random;

public class EmployeeWageBuilder {
    public static final int WAGE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    private final Employee employee = new Employee();

    public int computeWage() {
        int totalWage = 0;
        int totalHours = 0;
        int totalDays = 0;
        Random random = new Random();

        while (totalDays < MAX_WORKING_DAYS && totalHours < MAX_WORKING_HOURS) {
            int empCheck = random.nextInt(3); // 0 = Absent, 1 = Full Time, 2 = Part Time
            int hoursWorked = employee.getWorkingHours(empCheck);
            int dailyWage = hoursWorked * WAGE_PER_HOUR;

            totalHours += hoursWorked;
            totalWage += dailyWage;
            totalDays++;

            System.out.println("Day " + totalDays + ": Hours Worked = " + hoursWorked + ", Daily Wage = " + dailyWage);
        }

        System.out.println("\nTotal Hours: " + totalHours);
        System.out.println("Total Days: " + totalDays);
        System.out.println("Total Monthly Wage: " + totalWage);
        return totalWage;
    }
}
