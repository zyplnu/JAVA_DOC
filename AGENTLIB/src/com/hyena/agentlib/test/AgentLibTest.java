package com.hyena.agentlib.test;

/**
 * 这个类是为了测试 -agentlib:filename   -agentpath:filename
 * 上面的两个选项分别对应如下的代码
 * -agentlib:filename   System.loadLibrary(relative-filename)
 * -agentpath:filename System.load(absolute-filename)
 *
 * @author hyena
 */
public class AgentLibTest {

    public static void main(String[] args) {

        // print library path
        System.out.println(System.getProperty("java.library.path"));

        //System.load("/lib/libbrlttybbd.so");   // pass , use absolute file path

        System.loadLibrary("brlttybbd"); // pass , use relative file path ,
        // automatically add prefix "lib" , and suffix ".so"
        // so the real file name is "libbrlttybbd.so
        // find file in the java.library path
    }


}
