
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class reader {

    static Properties prop = new Properties();
    static FileInputStream fs;

    static {
        try {
            fs = new FileInputStream("D:/Software Automation/Mid/config.properties");
            prop.load(fs);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public reader() throws InterruptedException, FileNotFoundException {
    }

    public static String getitem(String name) {
        return prop.getProperty(name);
    }
}
