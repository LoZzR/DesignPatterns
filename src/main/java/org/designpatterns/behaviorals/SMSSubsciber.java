package org.designpatterns.behaviorals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMSSubsciber implements Subscriber{

    private static Logger logger = LoggerFactory.getLogger(SMSSubsciber.class);

    @Override
    public void update(Observable observable) {
        logger.info(">>>>>>>>>>>>>>>> SMSSubsciber {}", observable.lastNews);
    }
}
