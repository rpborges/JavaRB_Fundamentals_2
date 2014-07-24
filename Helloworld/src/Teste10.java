import java.util.Scanner;


public class Teste10 {

	public static void main(String[] args) {
		
		
		int o = 0;
		int i = 0;
		
		Scanner s = new Scanner(System.in);
		
		while (o == 0 ){
			
			System.out.println("1 Acao; 2 MaisAcao");
			
			i = s.nextInt();
			if (i != 1 && i != 2) {
				System.out.println("Opção errada!");
			}
			else {
				System.out.println("Escolheu a opão: " + i);
				o=i;
			}
				
		}
		
		s.close();
		System.out.println("Ok.");
	}
	
	
	
}
