package com.ynz.sandbox.currentmethod;

public class MethodReader {

    public static String readCurrentMethod() {
        StackTraceElement[] stackTrace = Thread.currentThread()
                .getStackTrace();
        return stackTrace[2].getMethodName();
    }
}
