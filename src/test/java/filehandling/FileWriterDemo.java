package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileWriterDemo {

	
	@Test
	public void testFileWriter() throws IOException {
		
		File f = new File("./abc.txt");
		
		String data = "File Handling with DC is simple";
		
		FileWriter fw = new FileWriter(f);
		
		fw.write(data);
		
		fw.close();
		
	}
	
	@Test(groups = {"smoke"})
	public void testFileReader() throws IOException {
		
		File f = new File("DC", "xyz.txt");
		
		FileReader fr = new FileReader(f);
		
		//System.out.println((char)fr.read());
		
		int n;
		
		while((n = fr.read())!=-1) {
			System.out.print((char)n);
		}
		
		fr.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
