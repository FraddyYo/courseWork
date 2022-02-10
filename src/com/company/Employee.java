package com.company;

import java.util.Objects;

public class Employee {
    private static int counter = 1;


    private final int id;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int department;
    private float salary;

    public Employee(String firstName, String middleName, String lastName, int department, float salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public String getFullName() {
        return firstName + "" + middleName + "" + lastName;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {this.department = department;}

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && salary == employee.salary && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName);
    }


    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, department, salary);
    }

    public String toString() {
        return "Сотрудник id " + id + " Имя " + firstName + " Отчество " + middleName + " Фамилия " + lastName + " Отдел" + department + " Зарплата " + salary;
    }
}
