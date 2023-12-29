package q3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;

public class q3 {

	public static void main(String[] args) throws FileNotFoundException , IOException {
		
		try(BufferedReader br =  new BufferedReader(new FileReader("script2.txt"));){
			
			ArrayList<String> al1 = new ArrayList<String>();
			
			String max_elem = "";
			String data;
			while((data = br.readLine()) != null) {
				
				al1.add(data);
			}
			
			for(String elem : al1)
			{
				if (elem.length() > max_elem.length()) {
					max_elem = elem;
				}
			}
			
			System.out.println("Longest WOrd is : "+max_elem);
			
			
			
			
		}
		
	}

}
