package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class WriteThe_Data
{
	@Test
	public void setData() throws IOException {
		FileOutputStream fos = new FileOutputStream("./configData.properties");
		Properties p = new Properties();
		Object store=p.setProperty("Name", "Dhiraj");
		p.store(fos, "Stored");
		
	}

}
