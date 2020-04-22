package org.github.seleniumjava.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    public static String get(String key) {
        try {
            InputStream input = new FileInputStream("src/test/resources/config.properties");
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
