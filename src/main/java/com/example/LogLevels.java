package com.example;


public class LogLevels {

    // Extract the message part of the log line
    public static String message(String logLine) {
        // Find the index of the first "]" and get the substring after it, then trim it
        int endIndex = logLine.indexOf("]: ");
        return logLine.substring(endIndex + 3).trim();
    }

    // Extract the log level part of the log line
    public static String logLevel(String logLine) {
        // Find the indexes of "[" and "]" and get the substring between them
        int startIndex = logLine.indexOf("[") + 1;
        int endIndex = logLine.indexOf("]");
        return logLine.substring(startIndex, endIndex).toLowerCase();
    }

    // Reformat the log line
    public static String reformat(String logLine) {
        // Get the message and log level parts
        String message = message(logLine);
        String logLevel = logLevel(logLine);
        // Combine them into the desired format
        return message + " (" + logLevel + ")";
    }

    public static void main(String[] args) {
        // Test the methods
        System.out.println(message("[ERROR]: Invalid operation")); // "Invalid operation"
        System.out.println(message("[WARNING]:  Disk almost full\r\n")); // "Disk almost full"
        System.out.println(logLevel("[ERROR]: Invalid operation")); // "error"
        System.out.println(reformat("[INFO]: Operation completed")); // "Operation completed (info)"
    }
}
