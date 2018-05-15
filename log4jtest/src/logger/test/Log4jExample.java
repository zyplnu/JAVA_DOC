package logger.test;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;


//
public class Log4jExample {


    public static void main(String[] args) {
        Logger rootLogger = Logger.getRootLogger();
//        rootLogger.setLevel(Level.INFO);
        rootLogger.addAppender(new ConsoleAppender(new PatternLayout("%-6r [%p] %c - %m%n")));


        // get logger , 这条语句的作用就是将类Log4jExample配置成为一个Logger
        Logger logger = Logger.getLogger(Log4jExample.class);
        logger.info("info message");
        logger.debug("debug message");
    }

}
