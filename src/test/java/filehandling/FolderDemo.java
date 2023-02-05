package filehandling;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

public class FolderDemo {

	
	@Test
	public void createFolder() throws IOException {
		
		File f = new File("DC", "xyz.txt");
		
		f.createNewFile();

		
	}
	
}
