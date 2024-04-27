package basics.common;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Generic {

    public static String getValue(String key){
        String value = null;
        String path =  System.getProperty("user.dir")+ File.separator+"config.properties";
        try {
            FileInputStream ip = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(ip);
            value = prop.getProperty(key);
            System.out.println("value :" + value);
        }catch (Exception e){

        }
        return value;
    }
}
