package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
    static String value= "";
    public static String getValue(String key) throws Exception {
        Properties property = new Properties();

        FileInputStream file = new FileInputStream("C:\\Users\\Sonam\\IdeaProjects\\SwagLab\\src\\test\\resources\\config\\config.propeties");
        property.load(file);
        value = property.getProperty(key);
        if (value == null || key == null) {
            throw new Exception("Property name" + key + "is not found. please check config.properties file");
        }
        return value;

    }
}
