package toolsQA.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        try {
            // what file to read
            String path = "configuration.properties";
            // read the file into java, finds the file using the string path
            FileInputStream input = new FileInputStream(path);
            // properties-->> class that store properties in key/ value format
            properties = new Properties();
            // the value from the input file input ids loaded/ fed in to the
            properties.load(input);
            input.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // how can we call the confirugationReader
    public static String get(String keyName) {
        return properties.getProperty(keyName);
    }


}
