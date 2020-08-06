package com.example.demo.common;

import org.slf4j.LoggerFactory;

public class Logger {
    private static final org.slf4j.Logger instance = LoggerFactory.getLogger(Logger.class);

    public static org.slf4j.Logger getInstance() {
        return instance;
    }
}
