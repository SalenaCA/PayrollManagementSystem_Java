package com.finance.banking.Atm;

public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String empName, int empId, double rate, int hours) {
        super(empName, empId); // implementing parent abstract class Employee
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    @Override // annotation to override payable method in Payable interface
    public double calculatePay() {
        return hoursWorked * hourlyRate; // weekly salary
    }

    @Override
    public String getPayStubDetails() {
        return "Employee name: " + name + " | Employee Id: " + id +
                "\nWeekly Salary: $" + calculatePay() + "\n";
    }
}
