package q4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class q4 {

	public static void main(String[] args) throws FileNotFoundException , IOException {
		
		String pathname = "script2.txt";
		
		
		{
			File file = new File(pathname);
			System.out.println(file.isHidden());
		}
		
		
		
	}

}
