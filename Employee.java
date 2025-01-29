package com.finance.banking.Atm;

import java.io.Serializable;

public abstract class Employee implements Payable, Serializable {
    protected String name;
    protected int id;

    public Employee(String empName, int empId){
        this.name = empName;
        this.id = empId;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public abstract String getPayStubDetails();
}
