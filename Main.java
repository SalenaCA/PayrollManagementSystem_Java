package com.finance.banking.Atm;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Payroll payroll = new Payroll(); // initialize payroll object

        // add Employees to system
        Employee emp1 = new SalariedEmployee("Jennifer Johnson", 1201, 115000);
        Employee emp2 = new SalariedEmployee("Michael Green", 1101, 125000);
        Employee emp3 = new HourlyEmployee("Chris Peart", 1001, 45, 60);
        Employee emp4 = new HourlyEmployee("Amber Reid", 2011, 45, 65);

        // adding Employees to Payroll
        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);
        payroll.addEmployee(emp3);
        payroll.addEmployee(emp4);

        // Generate paystubs
        payroll.generatePaystubs();
    }
}
