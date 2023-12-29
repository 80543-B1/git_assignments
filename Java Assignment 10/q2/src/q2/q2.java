package q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class q2 {

	public static void main(String[] args) throws FileNotFoundException , IOException {
		
		String filename = "script2.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File(filename)));)
		{
		String data;
		
//		while ((data = br.readLine()) != null ) {
//			System.out.println(data);
//		}
		
		
		ArrayList<String> al = new ArrayList<String>();
		
		while ((data = br.readLine()) != null ) {
			al.add(data);
		}
		
		System.out.println(al);
		
		String str_arr[] = new String[al.size()];
				
		al.toArray(str_arr);
		
		for (String element : str_arr)
			System.out.println(element);
		
		}
	
		
	
	}

}
