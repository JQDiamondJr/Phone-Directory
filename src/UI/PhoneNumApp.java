package UI;

import java.io.IOException;
import java.util.Scanner;

import businessObjects.Directory;
import service.DirectoryService;

public class PhoneNumApp {
	public static void main(String[] args) throws IOException {
		System.out.println("Please enter your first name: ");
		String fname = new Scanner(System.in).nextLine();

		System.out.println("Please enter your last name: ");
		String lname = new Scanner(System.in).nextLine();

		System.out.println("Please enter your 10 digit phone number: ");
		String phnum = new Scanner(System.in).nextLine();

		Directory directory = new Directory();
		directory.setFname(fname);
		directory.setLname(lname);
		directory.setphnum(phnum);

		DirectoryService directoryService = new DirectoryService();
		System.out.println(directoryService.saveDirectory(directory));
	}

}
