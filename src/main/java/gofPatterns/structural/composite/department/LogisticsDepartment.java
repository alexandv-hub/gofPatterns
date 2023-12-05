package gofPatterns.structural.composite.department;

public class LogisticsDepartment implements Department {

    @Override
    public void doJob() {
        System.out.println("Logistics department delivers product...");
    }
}
