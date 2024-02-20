package Utils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestDataLoader {
    private static Properties properties = new Properties();

    static {
        try {
            // Load properties file
            properties.load(new FileReader(System.getProperty("user.dir")+"/src/main/resources/Configs/testdata.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUsername() {
        return properties.getProperty("username");
    }

    public static String getPassword() {
        return properties.getProperty("password");
    }

    public static String getTitle() {
        return properties.getProperty("AdTitle");
    }
    public static String getPrice() {
        return properties.getProperty("AdPrice");
    }
}
