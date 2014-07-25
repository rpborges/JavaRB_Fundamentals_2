
public class Sessao_8 {
	
	public static void main(String[] args) {

		int a=4;
		int b=5;
		
		float total = sum(a,b);
		System.out.println(total);
		
		Shirt s = new Shirt("CAVALI",1,"T-Shirt Amarela");
		s.imprime();
		
	}
	
	
	
	
	public static float sum(float numeroum, float numerodois){
		System.out.println("dois");
		return numeroum + numerodois;
	}

	public static float sum(int numeroum, float numerodois){
		System.out.println("tres");
		return numeroum + numerodois;
	}
	
	
}
