package Java;

import java.util.*;

public class EMS {
    public static void main(String[]args)
    {
        System.out.println("Employee Management System");
        // int [] nums = new int[5]; // 0 to 4
        // Employee[] empArr = new Employee[5]; // 0 to 4
        // ArrayList<Employee> empList = new ArrayList<>(); //non-polymorphism
        // List <Employee> empList2 = new ArrayList<>(); // polymorphism
        List<Employee> empList3 = new LinkedList<>(); // polymorphism

        populate(empList3);

        displayAllEmployees(empList3);
    }

    private static void populate(List<Employee> empList3) {
            Department d1 = new Department(1, "HR");
            Department d2 = new Department(2, "Sales");

            Employee e1 = new Employee(1, "Rohit", 90000, d1);
            Employee e2 = new Employee(2, "Cesar", 100000, d2);
            Employee e3 = new Employee(3, "Jose", 200000, d1);
            Employee e4 = new Employee(4, "Mat", 300000, d2);
            Employee e5 = new Employee(5, "Tomy", 400000, d2);
         
            empList3.add(e1);
            empList3.add(e2);
            empList3.add(e3);
            empList3.add(e4);
            empList3.add(e5);
    }

     private static void displayAllEmployees(List<Employee> empList3) {
        for(Employee emp : empList3){
            System.out.println(emp);
        }
    }
    
}

//collection.sort() // sort the collection based on natural order


class Employee extends Object{ 
    private int id;
    private String name;
    private double salary;
    private Department dept;

    public Employee(int id, String name, double salary, Department dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public Department getDept() {
        return dept;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDept(Department dept) {
        this.dept = dept;
    }

    public String toString() {
        return "Employee: \n [id=" + id + ", name=" + name + ", salary=" 
        + salary + ", dept=" + dept.getDeptName() + "]";
    }
}

 class Department{
    private int id;
     private String deptName;

     public Department (int id, String deptName) {
        this.id = id;
        this.deptName = deptName;
     }


    public int getId() {
        return id;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;   
    }
}
 

        
