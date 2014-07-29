import java.util.ArrayList;


public class Teste21 {
public static void main(String[] args) {
	
	try
	{
		ArrayList<String> theList = new ArrayList<String>();
		while(true) {
			String theString = "A teste String ";
					theList.add(theString);
			if (theList.size()% 1000000 == 0 ) {
				System.out.println("A list tem agora " + theList.size()/1000000 + " milhoes de elementos");
				
			}
		}
	
	} catch(OutOfMemoryError e){
		System.out.println("Out-of-memory");
	}
	
	
	System.out.println("Out-of-memory");
}

}
}
