package com.ynz.sandbox.currentmethod;

public class PrintLog {

    public void printMethodA() {
        System.out.println(MethodReader.readCurrentMethod());

    }

    public void printMethodB() {
        System.out.println(MethodReader.readCurrentMethod());

    }
}
