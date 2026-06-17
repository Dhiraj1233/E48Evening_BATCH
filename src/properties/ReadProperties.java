package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperties 
{
	@Test
	public void data() throws IOException {
		FileInputStream fis = new FileInputStream("./configData.properties");
		Properties p = new Properties();
		p.load(fis);
		String usn = p.getProperty("usn");
		System.out.println(usn);
	}
}
