package gofPatterns.behavioral.interpreter;

import javax.naming.Context;

public class Minus implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public Minus(Expression left, Expression right) {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public int interpret(Context context) {
        return leftOperand.interpret(context) - rightOperand.interpret(context);
    }
}
