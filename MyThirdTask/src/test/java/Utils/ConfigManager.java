package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigManager {
    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;
    private static Logger logger = LoggerFactory.getLogger(ConfigManager.class);

    public static String getProperties(String key) {
        return PROPERTIES.getProperty(key);
    }

    static {
        try {
            fileInputStream = new FileInputStream("src/test/resources/conf.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException var9) {
            var9.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException var8) {
                    var8.printStackTrace();
                    logger.error("File not exist");
                }
            }

        }

    }
}
