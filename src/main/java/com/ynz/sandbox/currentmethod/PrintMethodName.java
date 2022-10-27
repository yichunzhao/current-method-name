package com.ynz.sandbox.currentmethod;

public class PrintMethodName {

    public void printMethodA() {
        System.out.println(MethodReader.readCurrentMethodName());
    }

    public void printMethodB() {
        System.out.println(MethodReader.readCurrentMethodName());
    }
}
