package gofPatterns.behavioral.interpreter;

import javax.naming.Context;

public class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
}

