package gofPatterns.behavioral.chain_of_responsibility;

public class LoggerChainBuilder {
    public static Logger buildLoggerChain() {
        Logger errorLogger = new ErrorLogger(LogLevel.ERROR);
        Logger warningLogger = new WarningLogger(LogLevel.WARNING);
        Logger infoLogger = new InfoLogger(LogLevel.INFO);

        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(infoLogger);

        return errorLogger;
    }
}

