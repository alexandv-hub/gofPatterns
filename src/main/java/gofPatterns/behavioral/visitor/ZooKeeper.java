package gofPatterns.behavioral.visitor;

public class ZooKeeper implements ZooStaff {
    @Override
    public void visit(Tiger tiger) {
        System.out.println("Zookeeper is feeding Tiger...");
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Zookeeper is feeding Elephant...");
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("Zookeeper is feeding Monkey...");
    }
}
