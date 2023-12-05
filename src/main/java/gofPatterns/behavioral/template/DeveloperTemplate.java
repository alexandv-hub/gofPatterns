package gofPatterns.behavioral.template;

public abstract class DeveloperTemplate {

    void developNewFeature() {
        clarifyRequirements();
        designingSolution();
        writeCode();
        testing();
    }

    void clarifyRequirements() {
        System.out.println("Developer clarifies task requirements...");
    }

    void designingSolution() {
        System.out.println("Developer is designing the task solution...");
    }

    abstract void writeCode();

    public void testing() {
        System.out.println("Developer is testing code...");
    }



}
