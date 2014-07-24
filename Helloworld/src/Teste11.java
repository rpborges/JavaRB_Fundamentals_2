import java.util.ArrayList;




public class Teste11 {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> Nomes = new ArrayList<String>();
		
		Nomes.add("Nome 1");
		Nomes.add("Jeghdish");
		Nomes.add("Mourato");
		Nomes.add("Aniceto");
		Nomes.add("");
		Nomes.add(1, "Nome 2");

		for ( String s : Nomes) {
			System.out.println(s);
		}
		
		
		
		
		
	}
	
	
}
