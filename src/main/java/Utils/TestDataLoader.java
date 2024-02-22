package Utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// TestDataLoader class is responsible for loading test data from properties files
public class TestDataLoader {
    // Properties object to store test data
    private static Properties _properties = new Properties();

    // Static block to initialize properties from the properties file
    static {
        try {
            // Load properties file
            _properties.load(new FileReader(System.getProperty("user.dir") + "/src/main/resources/Configs/testdata.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get the username from the properties file
    public static String getUsername() {
        return _properties.getProperty("username");
    }

    // Method to get the password from the properties file
    public static String getPassword() {
        return _properties.getProperty("password");
    }

    // Method to get the advertisement title from the properties file
    public static String getTitle() {
        return _properties.getProperty("AdTitle");
    }

    // Method to get the advertisement price from the properties file
    public static String getPrice() {
        return _properties.getProperty("AdPrice");
    }
}
