package gofPatterns.behavioral.visitor;

public class Tiger extends Animal {
    @Override
    void visit(ZooStaff visitor) {
        visitor.visit(this);
    }
}
