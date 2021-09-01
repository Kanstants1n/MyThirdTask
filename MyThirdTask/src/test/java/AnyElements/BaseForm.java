//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package AnyElements;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseForm {
    private BaseElement baseElement;
    private String loggerName;

    public BaseForm(BaseElement baseElement, String loggerName){
        this.baseElement = baseElement;
        this.loggerName = loggerName;
    }
    private Logger logger = LoggerFactory.getLogger(BaseForm.class);

    public boolean isDisplayed() {
        logger.info("Display — {}", loggerName);
        return baseElement.isDisplay();
    }
}
