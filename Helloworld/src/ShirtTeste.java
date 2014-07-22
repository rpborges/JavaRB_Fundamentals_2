
public class ShirtTeste {

public static void main(String[] args) {
	
	Shirt s = new Shirt(1,"T-Shirt Azul");
	Shirt x = s;
	Shirt w = new Shirt(1,"T-Shirt Azul");
	
	
	System.out.println(s.equals(x));
	System.out.println(s.equals(w));
}
	
	
}
