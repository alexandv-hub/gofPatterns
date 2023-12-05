package gofPatterns.behavioral.visitor;

public interface ZooStaff {
    void visit(Tiger tiger);
    void visit(Elephant elephant);
    void visit(Monkey monkey);
}
