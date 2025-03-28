package com.bridgelabz.mapinterface;

import java.util.*;
class Employee {
    String name, department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupObjects {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        System.out.println(groupByDepartment(employees));
    }

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        employees.forEach(e -> departmentMap.computeIfAbsent(e.department, k -> new ArrayList<>()).add(e));
        return departmentMap;
    }
}
