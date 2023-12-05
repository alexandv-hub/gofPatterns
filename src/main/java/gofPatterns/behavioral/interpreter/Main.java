package gofPatterns.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        // (1 + 2) - 3 = 0
        Expression expression = new Minus(
                new Plus(new Number(1), new Number(2)),
                new Number(3)
        );

        System.out.println(expression.interpret(null)); // Выводит 0
    }
}

