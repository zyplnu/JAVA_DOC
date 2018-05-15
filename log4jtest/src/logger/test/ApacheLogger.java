package logger.test;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class ApacheLogger {

    public static void main(String[] args) throws ClassNotFoundException {
        Logger logger = Logger.getRootLogger();
        logger.info("what do you mean ");

//        Logger console = Logger.getLogger("console");
//        console.info("what");
        logger.debug("this is a debug message");


        Class.forName("hyena.hello.Hello");
    }


}
