package gofPatterns.behavioral.chain_of_responsibility;

public class WarningLogger extends Logger {
    public WarningLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("WARNING: " + message);
    }
}
