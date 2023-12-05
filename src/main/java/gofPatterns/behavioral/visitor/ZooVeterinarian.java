package gofPatterns.behavioral.visitor;

public class ZooVeterinarian implements ZooStaff {
    @Override
    public void visit(Tiger tiger) {
        System.out.println("Zoo veterinarian is checking health of Tiger...");
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Zoo veterinarian is checking health of Elephant...");
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("Zoo veterinarian is checking health of Monkey...");
    }
}
