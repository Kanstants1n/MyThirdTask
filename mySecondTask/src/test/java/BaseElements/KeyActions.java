package BaseElements;

import Utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KeyActions extends BaseElement{
    public KeyActions(By elementBy, String loggerName) {
        super(elementBy, loggerName);
    }
    private Logger logger = LoggerFactory.getLogger(BaseElement.class);

    public void pushAnyKey(double someNumber) {

        for (int i = 0; i < someNumber; i++) {
            pushKeyRight();
        }
        logger.info("Random value for slider {}", someNumber);
    }
}
