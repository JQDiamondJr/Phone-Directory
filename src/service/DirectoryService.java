package service;

import java.io.IOException;

import businessObjects.Directory;
import dataAccess.MockPhoneDir;

public class DirectoryService {
	public String saveDirectory(Directory directory) throws IOException {
		MockPhoneDir mockDAO = new MockPhoneDir();

		mockDAO.createFileAndSaveDirectory(directory);
		return "The name and phone number have been saved in folder";

	}

}
