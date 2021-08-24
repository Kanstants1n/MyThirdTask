package BaseElements;

import org.openqa.selenium.By;

public class TextField extends BaseElement{
    public TextField(By elementBy, String loggerName) {
        super(elementBy, loggerName);
    }

    public int lengthString(){
       return getText().length();
    }


}
