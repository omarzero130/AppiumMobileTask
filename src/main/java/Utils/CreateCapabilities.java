package Utils;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class CreateCapabilities {
    static DesiredCapabilities desiredCapabilities;
    public static Map<String, Object> getCapabilities() {
        Map<String, Object> keyValueMap = new HashMap<>();
        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader(System.getProperty("user.dir")+"/src/main/resources/Configs/caps.json")) {
            keyValueMap = (JSONObject) parser.parse(reader);
            for (Map.Entry<String, Object> entry : keyValueMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return keyValueMap;
    }
    public static DesiredCapabilities setDesiredCapabilities() {
        desiredCapabilities = new DesiredCapabilities();
        Map<String, Object> keyValueMap = getCapabilities();
        for (Map.Entry<String, Object> entry : keyValueMap.entrySet()) {
            desiredCapabilities.setCapability(entry.getKey(), entry.getValue());
        }
        return desiredCapabilities;
    }
    public static void main(String[]args){
        getCapabilities();
    }
}
