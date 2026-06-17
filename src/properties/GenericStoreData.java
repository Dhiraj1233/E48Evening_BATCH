package properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GenericStoreData
{
	public Object setData(String key,String value) throws IOException {
		FileOutputStream fos = new FileOutputStream("./configData.properties");
		Properties p = new Properties();
		Object store=p.setProperty(key,value);
		p.store(fos, "Stored");
		return store;
	}
}
