package properties;

import java.io.IOException;

import org.testng.annotations.Test;

public class GenericReadData 
{
	@Test(enabled = false)
	public void readData() throws IOException {
		GenericProperty gp = new GenericProperty();
		System.out.println(gp.data("psw"));
	}
	@Test
	public void writeData() throws IOException {
		GenericStoreData gs = new GenericStoreData();
		gs.setData("Name","Ranveer");
	}
}
