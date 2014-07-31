
public class IfTest {


public static void main(String args[]){ 
	
	char c = 320; 
	 
	float f = 320; 
	 
	//double d = 320; 
	 
	byte b = (byte) 320; 
	
	Integer i = new Integer(42); 
	Long ln = new Long(42); 
	Double d = new Double(42.0);

//	if( i == d)
//		; 
//	 i.equals(d); 
//	 d.equals(ln); 
//	 ln.equals(42); 
	 System.out.println(i.equals(42));
	 System.out.println(d.equals(42));
	 System.out.println(ln.equals((long)42));
	
	/*
	 * byte		-128		127				8 bit signed
	 * short	-32768		32767           16 bit signed
	 * int		
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	Conversion();
	
if (true) 
if (false) 
System.out.println("True False"); 
else 
System.out.println("True True"); 
System.out.println(b); 
}

public static  void Conversion(){ 
	 
	 long i = 1999999999; 
	 double f = i; 
	 
	 System.out.println((long)f); 
	 System.out.println(f ); 
	 System.out.println(f-i ); 
	 
	}

}