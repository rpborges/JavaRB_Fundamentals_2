
public class teste1 {
	
	public static void main(String[] args) {
//		short a, b;
//		int c;
//	    short i;
//		a=1;
//		b=2;
//		c= (short) a + b;
	
		
//		final short g=5, h=4;
//		final short g, h;
//		g=5;
//		h=4;
		
//		i = g + h;
		
//		System.out.println(i=h); 
//		
//	
//		
//		String hisName = "Rui Borges";
//		String herName = new String("Eva Mendes");
//		String newName = "Eva Mendes";
//		
//		String yourName = new String();
//		yourName = "Rui Borges";
//		
//		System.out.println(herName.equals(herName));
//		System.out.println(hisName == herName);
//		System.out.println(hisName == yourName);
		
		//System.out.println("Hello World".substring(6, 2));
		System.out.println("Hello World".substring(6));
		System.out.println("Hello World".substring(6, 8));
		
		System.out.println("Hello World".subSequence(3, 10));		
		
		System.out.println("Hello World".substring(6).endsWith("rld") );	
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.capacity());		
		sb.append("Hello World! This is it");
		
		System.out.println(sb.capacity());		
		System.out.println(sb.length());		

	sb.trimToSize();
	sb.replace(0, sb.length(), "").trimToSize();	
	sb.append("Este é um novo Mundo" + "\n");

		System.out.println(sb.capacity());		
		System.out.println(sb.length());		

		
		sb.append("numa nova linha" + "\n");
		sb.append("numa nova dimensão.");
		
		System.out.println(sb.toString());		
	
		sb=new StringBuilder("Ok. Hello new world. \n In my way.");
		System.out.println(sb.toString());		

		
		
	
	}
}
	