package basics.common;

import java.io.File;
import java.io.IOException;

public class Creating_PropertyFile {

    public static void main(String[] args) throws IOException {
      String path =  System.getProperty("user.dir")+ File.separator+"dummy.txt";
      System.out.println(path);

      File file = new File(path);
      file.createNewFile();

    }
}
