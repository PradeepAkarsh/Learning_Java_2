package basics.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading_PropertyFile {
    public static void main(String[] args) throws IOException {


        String path =  System.getProperty("user.dir")+ File.separator+"config.properties";

        FileInputStream ip = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(ip);
        String value = prop.getProperty("url");
        System.out.println("value :"+value);
    }
}
