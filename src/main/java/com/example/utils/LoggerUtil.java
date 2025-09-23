package com.example.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Utility class for obtaining and using Log4j2 loggers.
 */
public final class LoggerUtil {

    private LoggerUtil() {
        // Prevent instantiation
        throw new AssertionError("No instances of LoggerUtil allowed");
    }

    /**
     * Returns a logger for the given class.
     *
     * @param clazz the class to obtain a logger for; must not be null
     * @return the logger associated with the class
     * @throws IllegalArgumentException if clazz is null
     */
    public static Logger getLogger(Class<?> clazz) {
        if (clazz == null) {
            throw new IllegalArgumentException("Class must not be null");
        }
        return LogManager.getLogger(clazz);
    }

    /**
     * Returns a logger for the given name.
     *
     * @param name logger name; must not be null or blank
     * @return the logger associated with the name
     * @throws IllegalArgumentException if name is null or blank
     */
    public static Logger getLogger(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Logger name must not be null or blank");
        }
        return LogManager.getLogger(name);
    }

    /**
     * Logs an INFO message using the provided logger.
     *
     * @param logger  the logger to use; must not be null
     * @param message the message to log
     * @throws IllegalArgumentException if logger is null
     */
    public static void info(Logger logger, String message) {
        if (logger == null) {
            throw new IllegalArgumentException("Logger must not be null");
        }
        logger.info(message);
    }

    /**
     * Logs an ERROR message with an optional throwable using the provided logger.
     *
     * @param logger   the logger to use; must not be null
     * @param message  the message to log
     * @param throwable an optional throwable to include
     * @throws IllegalArgumentException if logger is null
     */
    public static void error(Logger logger, String message, Throwable throwable) {
        if (logger == null) {
            throw new IllegalArgumentException("Logger must not be null");
        }
        logger.error(message, throwable);
    }
}
