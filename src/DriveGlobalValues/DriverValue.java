package DriveGlobalValues;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverValue {

    public static void main(String[] args) throws IOException, InterruptedException {
        //Properties class is used to recognise item in properties file
        Properties prop = new Properties();
        // To find the file we have to create fileInputstream class
        FileInputStream fis = new FileInputStream("C:\\Users\\prana\\Downloads" +
                "\\SeleniumCucumber-master\\com.JavaRevision\\src\\DriveGlobalValues\\data.properties");
        //Now fis know where is the file located but to give property object where is  the file located
        // For that there is method load(Inputstream ) that will find the file
        prop.load(fis);
        //Now the prop has knowledge to reterive the file
        System.out.println( prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));
        Thread.sleep(2000);
        //Now let change property in run time
        prop.setProperty("browser","Firefox");
        System.out.println(prop.getProperty("browser"));
        //Now to write value to the file
        FileOutputStream fos =new FileOutputStream("C:\\Users\\prana\\Downloads" +
                "\\SeleniumCucumber-master\\com.JavaRevision\\src\\DriveGlobalValues\\data.properties");
        //We will put fos object and we don't have comment so make it null
        prop.store(fos,null);




    }
}
