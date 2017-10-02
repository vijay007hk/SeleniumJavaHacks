package firstPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	public static void main(String []args) throws IOException{
		
		Properties prop = new Properties();
		FileReader file = new FileReader("C:\\selenium-workspace\\FirstProject\\src\\config\\Test.properties");
		prop.load(file);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("city"));
	}

}
