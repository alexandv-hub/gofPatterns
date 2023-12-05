package gofPatterns.structural.composite;

import gofPatterns.structural.composite.department.Department;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Department> departments = new ArrayList<>();

    void addDepartment(Department department) {
        departments.add(department);
    }

    void doBusiness() {
        System.out.println("Company starts doing business...");

        for (Department department : departments) {
            department.doJob();
        }
    }
}
