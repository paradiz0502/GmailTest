package utils;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesManager {
    private static final Logger log = Logger.getLogger(PropertiesManager.class);

    private static PropertiesManager instance = null;
    private Properties properties;

    private PropertiesManager(String filePath) {
        properties = new Properties();
        try {
            properties.load(new FileInputStream(filePath));
        } catch (Exception e) {
            log.warn("There is no properties file");
        }
    }

    public static PropertiesManager getInstance(String filePath) {
        if (instance == null) {
            instance = new PropertiesManager(filePath);
        }
        return instance;
    }

    public String getValue(String key) {
        if (properties != null) {
            return properties.getProperty(key);
        }
        return null;
    }

}
