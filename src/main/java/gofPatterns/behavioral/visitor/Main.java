package gofPatterns.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Tiger(), new Elephant(), new Monkey()};
        Zoo zoo = new Zoo(animals);

        ZooStaff zooVet = new ZooVeterinarian();
        ZooStaff zooKeeper = new ZooKeeper();

        zoo.applyVisitor(zooVet);
        System.out.println("_________________");
        zoo.applyVisitor(zooKeeper);
    }
}
