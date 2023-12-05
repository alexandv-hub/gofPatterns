package gofPatterns.behavioral.interpreter;

import javax.naming.Context;

public interface Expression {
    int interpret(Context context);
}
