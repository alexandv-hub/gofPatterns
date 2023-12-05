package gofPatterns.behavioral.visitor;

public class Elephant extends Animal {
    @Override
    void visit(ZooStaff visitor) {
        visitor.visit(this);
    }
}
