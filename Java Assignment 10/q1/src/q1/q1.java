package q1;

import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class q1 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Filename : ");
		String filename = sc.nextLine();
		
		try {
		FileReader fr = new FileReader(new File(filename));
		
		System.out.println("We can read above mentioned File ");
		}
		
		catch(FileNotFoundException e){
			System.out.println("File not found .");
		}
	}

}
