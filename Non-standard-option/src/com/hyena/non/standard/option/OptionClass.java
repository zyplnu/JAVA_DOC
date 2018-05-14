package com.hyena.non.standard.option;


/**
 * VM options : -Xprof  -Xbatch -Xdebug
 *              -Xbootclasspath/p:com.hyena.non.standard.option
 *              -XX:+TraceClassLoading
 *
 */
public class OptionClass {


    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(System.getProperty("sun.boot.class.path"));
    }
}
