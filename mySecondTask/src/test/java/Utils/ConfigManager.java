package Utils;

import BaseElements.BaseElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;
    private static Logger logger = LoggerFactory.getLogger(ConfigManager.class);

    static {
        try {
            fileInputStream = new FileInputStream("src/test/resources/conf.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    logger.error("File not exist");
                }
        }

    }
    public static String getProperties(String key){
        return PROPERTIES.getProperty(key);
    }


}


