package gofPatterns.structural.composite.department;

public class ProductionDepartment implements Department {

    @Override
    public void doJob() {
        System.out.println("Production department produces product...");
    }
}
