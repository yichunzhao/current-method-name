package com.ynz.sandbox.currentmethod;

public class MethodReader {

    public static String readCurrentMethodName() {
        StackTraceElement[] stackTrace = Thread.currentThread()
                .getStackTrace();
        return stackTrace[2].getMethodName();
    }
}
