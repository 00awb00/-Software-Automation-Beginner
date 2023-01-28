package Propreader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    static FileInputStream fs;

    static Properties prop = new Properties();

    public static void Load(String filepath) throws IOException {
        fs = new FileInputStream(filepath);
        prop.load(fs);

    }

    public static String GetValue(String value){
        return prop.getProperty(value);
    }
}
