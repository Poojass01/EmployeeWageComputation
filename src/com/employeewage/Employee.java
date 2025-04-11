package com.employeewage;

public class Employee {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;

    public int getWorkingHours(int empCheck) {
        switch (empCheck) {
            case FULL_TIME:
                return 8;
            case PART_TIME:
                return 4;
            default:
                return 0;
        }
    }
}
