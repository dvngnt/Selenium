package ex10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property {
	
	Properties property;
	FileInputStream fs;
	@Test
	public void testProperty() throws IOException{

		fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\ex10\\config.properties");
		property = new Properties();
		property.load(fs);
		System.out.println(property.getProperty("url"));

	}

}
