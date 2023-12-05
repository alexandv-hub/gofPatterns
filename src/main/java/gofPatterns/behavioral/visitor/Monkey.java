package gofPatterns.behavioral.visitor;

public class Monkey extends Animal {
    @Override
    void visit(ZooStaff visitor) {
        visitor.visit(this);
    }
}
