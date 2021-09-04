package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite_PropertiesFile {

	public static void main(String[] args) throws IOException {
		// Most Companies use these files
		
		//First you have to create properties file, xml or excel file and the you can write and read.
		
		//Properties File is always in "name = value" form.
		
		//Read from PropertiesFile
		FileInputStream f = new FileInputStream("C:\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String Browser = prop.getProperty("browser");
		System.out.println(Browser);
		
		System.out.println(prop.getProperty("test"));
		System.out.println(prop.getProperty("incorrectemail"));
		System.out.println(prop.getProperty("correctEmail"));
		System.out.println(prop.getProperty("url"));
		
		//Write into Properties File - 99% of time, we only need to read.
		//This stores into Java memory the value of tool, but actually doesn't print it in the properties file.
		prop.setProperty("tool", "Selenium");
		System.out.println(prop.getProperty("tool"));
		
		prop.setProperty("town", "Brampton");
		System.out.println(prop.getProperty("town"));
		
		//This actually writes into the file
		FileOutputStream fo = new FileOutputStream("C:\\Testing\\prop.properties");
		prop.store(fo, "Adding to the properties File");
	}

}
