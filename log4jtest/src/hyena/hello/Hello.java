package hyena.hello;

import org.apache.log4j.Logger;

public class Hello {

    private static Logger logger = Logger.getLogger("Hello");


    static {

        for (int i = 0; i < 10000; i++) {
            logger.info("counter :" + i);
        }
    }


}
