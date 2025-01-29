package com.finance.banking.Atm;

public class SalariedEmployee extends Employee {

    private double salary;

    public SalariedEmployee(String empName, int empId, double annualSalary) {
        super(empName, empId); // implementing parent abstract class Employee
        this.salary = annualSalary;
    }

    @Override // annotation to override payable method in Payable interface
    public double calculatePay() {
        return salary/12; // monthly salary
    }

    @Override
    public String getPayStubDetails() {
        return "Employee name: " + name + " | Employee Id: " + id +
                "\nMonthly Salary: $" + calculatePay() + "\n";
    }
}
