package com.tms.models;

import lombok.Getter;

import java.util.List;

@Getter
public class Report implements ReportAware {
    private List<Employee> employees;

    public Report(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void generateReport() {
        for (Employee employee : employees) {
            String text = String.format("| %-35s | %,10.2f |",
                    formatFullName(employee.getFullName()), employee.getSalary());
            System.out.println(text);
        }

    }

    private Object formatFullName(String fullName) {
        String[] s = fullName.split(" ");
        if (s.length == 3) {
            return s[1].charAt(0) + "." + s[2].charAt(0) + "." + s[0];
        }
        return fullName;
    }
}
