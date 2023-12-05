package gofPatterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        DeveloperTemplate javaDev = new JavaDeveloper();
        DeveloperTemplate cppDev = new CppDeveloper();

        javaDev.developNewFeature();
        System.out.println("____________");
        cppDev.developNewFeature();
    }
}
