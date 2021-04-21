package collectionPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(".//abc.properties");
		p.load(fis);
		System.out.println(p);
		System.out.println(p.getProperty("data"));
		p.setProperty("data", "5555");
		p.setProperty("newDatum", "600");
		FileOutputStream fos = new FileOutputStream(".//abc.properties");
		p.store(fos, "updated by Amandeep for demo purpose.");
	}
}
