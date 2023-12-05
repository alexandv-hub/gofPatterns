package gofPatterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        String[] stack = {"Java", "Spring", "Python", "PostgreSQL", "Kubernetes", "Docker"};
        SoftwareProject SoftwareProject = new SoftwareProject("BankingSoftware", stack);

        Iterator iterator = SoftwareProject.getIterator();
        System.out.println("Software project name: " + SoftwareProject.getName());
        System.out.println("Stack: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
