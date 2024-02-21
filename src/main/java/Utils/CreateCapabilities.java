package Utils;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

// CreateCapabilities class is responsible for creating DesiredCapabilities for Appium driver initialization
public class CreateCapabilities {
    static DesiredCapabilities desiredCapabilities;

    // Method to retrieve capabilities from a JSON file
    public static Map<String, Object> getCapabilities() {
        Map<String, Object> keyValueMap = new HashMap<>();
        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader(System.getProperty("user.dir")+"/src/main/resources/Configs/caps.json")) {
            // Parse the JSON file and store the capabilities in a key-value map
            keyValueMap = (JSONObject) parser.parse(reader);
            // Print out the capabilities for debugging purposes
            for (Map.Entry<String, Object> entry : keyValueMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return keyValueMap;
    }

    // Method to set DesiredCapabilities based on retrieved capabilities
    public static DesiredCapabilities setDesiredCapabilities() {
        desiredCapabilities = new DesiredCapabilities();
        // Retrieve capabilities from the JSON file
        Map<String, Object> keyValueMap = getCapabilities();
        // Set each capability in the DesiredCapabilities object
        for (Map.Entry<String, Object> entry : keyValueMap.entrySet()) {
            desiredCapabilities.setCapability(entry.getKey(), entry.getValue());
        }
        return desiredCapabilities;
    }

    // Main method for testing purposes, retrieves and prints capabilities
    public static void main(String[] args) {
        getCapabilities();
    }
}
