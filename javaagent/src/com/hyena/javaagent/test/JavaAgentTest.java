package com.hyena.javaagent.test;


import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;

public class JavaAgentTest{


//    public static void premain(String args, Instrumentation instrumentation) {
//
//        Class[] allLoadedClasses = instrumentation.getAllLoadedClasses();
//        for (Class clazz : allLoadedClasses) {
//            System.out.println(clazz.getName());
//        }
//
//
//        // 只有一个方法需要重写，就可以使用lambda表达式
//        ClassFileTransformer classFileTransformer = (loader, className, classBeingRedefined, protectionDomain, classfileBuffer) ->{
//           return null ;
//        } ;
//        instrumentation.addTransformer(classFileTransformer);
//
//
//    }

    public static void premain(String args){
        System.out.println("before main ");
    }


}