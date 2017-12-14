package dataAccess;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import businessObjects.Directory;

public class MockPhoneDir {
	public void createFileAndSaveDirectory(Directory directory) throws IOException {
		String seperator = System.lineSeparator();
		String directoryOutputData =
				"First Name: " + directory.getFname() + seperator
				+ "Last Name: " + directory.getLname() + seperator
				+ "Phone Number: " + directory.getPhnum();
		
		FileOutputStream fileOutput = new FileOutputStream(
		"C:\\Users\\javaclass\\Desktop\\data\\" + LocalDate.now()+ directory.getLname()
		+ "PhoneDirectory.txt");
		
		fileOutput.write(directoryOutputData.getBytes());
		fileOutput.close();
	}

}
