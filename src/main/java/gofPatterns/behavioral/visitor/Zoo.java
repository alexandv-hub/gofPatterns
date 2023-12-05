package gofPatterns.behavioral.visitor;

public class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void applyVisitor(ZooStaff visitor) {
        for (Animal animal : animals) {
            animal.visit(visitor);
        }
    }
}
