

public class Day1_3 {

	public static void main(String[] args) {
		
// A)
		byte b = 16;
		System.out.println("byte : "+b);
		
		Byte B = Byte.valueOf(b);
		System.out.println("Byte : "+B );

// B)
	System.out.println("******************************************************************");
		
		int i = 15;
		Integer I = Integer.valueOf(i);
		System.out.println("Integer : "+I);
	
		Integer I2 = 15;
		int i2 = I2.intValue();
		System.out.println("int value : "+i2);
		
// C)		
	System.out.println("******************************************************************");
		
		float f1  = 9.8f;
		Float F1 = Float.valueOf(f1);
		System.out.println("Float : "+F1);
		
		Float F2 = 7.7f;
		float f2 = F2.floatValue();
		System.out.println("float value : "+f2);
		
// D)
	System.out.println("******************************************************************");
		
		double d1 = 111.777;
		Double D1 = Double.valueOf(d1);
		System.out.println("Double value : "+D1);
		
		Double D2 = 888.333;
		double d2 = D2.doubleValue();
		System.out.println("double : "+d2);
		
	}

}
	









