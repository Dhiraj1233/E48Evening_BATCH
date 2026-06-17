package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GenericProperty 
{
	public Object data(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./configData.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
}
