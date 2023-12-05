package gofPatterns.behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Logger loggerChain = LoggerChainBuilder.buildLoggerChain();

        loggerChain.logMessage(LogLevel.INFO, "This is an informational message.");
        loggerChain.logMessage(LogLevel.WARNING, "This is a warning message.");
        loggerChain.logMessage(LogLevel.ERROR, "This is an error message.");
    }
}
