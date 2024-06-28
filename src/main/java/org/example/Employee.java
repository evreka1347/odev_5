package org.example;

public class Employee {
    private String name;
    private int dailySalary;
    private int day;

    public String getName() {
        return name;
    }

    public int getdailySalary() {
        return dailySalary;
    }

    public int getDay() {
        return day;
    }

    public Employee(String name, int dailySalary, int day ){
        this.name = name;
        this.dailySalary = dailySalary;
        this.day = day;
    }

    public double calculateSalary(){
        return dailySalary * day;
    }

    public double calculateExtra(){
        int extraDay = day - 25;
        double extra = (extraDay > 0) ? extraDay * 1000 : 0;
        return extra;
    }

    public double calculateTotalPayment(){
        return calculateSalary() + calculateExtra();
    }
}
