package org.example;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Esma Coban", 2000, 35);

        double monthlySalary = employee.calculateTotalPayment();
        System.out.println("Aylık kazancınız: " + monthlySalary);

        double extraSalary = employee.calculateExtra();
        System.out.println("Bu ayki priminiz: " + extraSalary);
    }
}