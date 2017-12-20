import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesLoadDemo {
    public static void main(String[] args) {
        Properties pro = new Properties();
        File file = new File("H:"+File.separator+"area.properties");
        try {
            pro.load(new FileInputStream(file));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("BJ的属性存在"+pro.getProperty("BJ"));
    }
}
