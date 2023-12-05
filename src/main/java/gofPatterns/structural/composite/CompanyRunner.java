package gofPatterns.structural.composite;

import gofPatterns.structural.composite.department.LogisticsDepartment;
import gofPatterns.structural.composite.department.ProductionDepartment;
import gofPatterns.structural.composite.department.SalesDepartment;

public class CompanyRunner {
    public static void main(String[] args) {
        Company company = new Company();
        company.addDepartment(new SalesDepartment());
        company.addDepartment(new ProductionDepartment());
        company.addDepartment(new LogisticsDepartment());

        company.doBusiness();
    }
}
