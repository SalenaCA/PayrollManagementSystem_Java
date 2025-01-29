package com.finance.banking.Atm;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Payroll {
    private List<Employee> employees;

    public Payroll(){
        employees = new ArrayList<>(); // initializing the list object
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void generatePaystubs(){
        String filename = "paystubs.txt";
        FileWriter writer = null; // filewriter object

        try {
            writer = new FileWriter(filename); // initialize filewriter object

            for (Employee emp : employees) {
                String paystub = emp.getPayStubDetails();
                System.out.println(paystub);
                writer.write(paystub + "\n------------------------------\n");
            }
            System.out.println("Paystubs saved to " + filename);
        }
        catch (IOException e) {
            System.out.println("Error writing to file. " + e.getMessage());
        }
        finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
        }
    }
}
