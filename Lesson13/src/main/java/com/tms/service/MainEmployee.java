package com.tms.service;

import com.tms.models.Employee;
import com.tms.models.Report;
import com.tms.models.ReportAware;

import java.util.ArrayList;
import java.util.List;

public class MainEmployee {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Петров Владимир Владимирович", 950.99));
        employees.add(new Employee("Иванов Александр Григорьевич", 1950.99));

        Employee employee = new Employee("Козлов Иван Петрович", 2500);
        employees.add(employee);

        Employee clone = (Employee) employee.clone();
        clone.setFullName("Васечкин Петр Петрович");
        clone.setSalary(300.00);

        employees.add(clone);

        ReportAware report = new Report(employees);
        report.generateReport();
    }
}
