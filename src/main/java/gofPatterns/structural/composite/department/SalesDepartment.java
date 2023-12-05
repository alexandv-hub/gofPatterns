package gofPatterns.structural.composite.department;

public class SalesDepartment implements Department {

    @Override
    public void doJob() {
        System.out.println("Sales department sells company product...");
    }
}
