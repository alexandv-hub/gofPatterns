package gofPatterns.behavioral.state;

public class ProductionDeployment implements TaskActivity {

    @Override
    public void workOnTask() {
        System.out.println("The task completed. New feature was deployed to production.");
        System.out.println("________________________");
    }
}
