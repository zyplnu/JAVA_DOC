package logger.test;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.RootLogger;

public class Log4jExample {


    public static void main(String[] args) {
        Logger logger = Logger.getLogger(RootLogger.class);
        logger.addAppender(new ConsoleAppender());
        logger.debug("hello this is a debug messgae");
        logger.info("hello this is an info message");

    }

}
