package test;
import java.io.IOException; 

class Derived  

{ 

    public void getDetails() throws Exception //line 23 

    { 

        System.out.println("Derived class"); 

    } 

} 

  

public class Main extends Derived 

{ 

    public void getDetails() throws IOException //line 24 

    { 

        System.out.println("Test class"); 

    } 

    public static void main(String[] args) throws IOException //line 25 

    { 

        Derived obj = new Main(); 

        obj.getDetails(); 

    } 

} 