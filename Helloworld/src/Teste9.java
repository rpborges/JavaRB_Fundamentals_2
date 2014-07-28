
public class Teste9 {

public static void main(String[] args) {
	
	
	Shirt[] meusShirts = new Shirt[5];

	String[] meses ={"", "Jan.", "Fev.", "Mar.", "Abr.", "Mai.", "Jun.", "Jul.", "Ago.", "Set.", "Out.", "Nov.", "Dez." };
	int[][] matriz = { {},
			 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 },
			 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 },
			 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 },
			 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 },
			 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 },
			 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 },
			 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 },
			 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 },
			 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 },
			 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 },
			 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 },
			 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 }
	     };
	StringBuilder sb;
	
	for (int n=1;n<matriz.length;n++){
		sb = new StringBuilder();
		sb.append(meses[n] + " -- ");
		
		for (int m=0;m<matriz[n].length ;m++){
			sb.append("[" + matriz[n][m] + "]");
		}
		
		System.out.println(sb.toString());
	}
	
//	meusShirts[0] = new Shirt(0, "Azul");
//	meusShirts[1] = new Shirt(1, "Amarelo");
//	//meusShirts[2] = new Shirt(2, "Ambar");
//	meusShirts[4] = new Shirt(4, "Anil");
//
	for (int n = 0 ;n < meusShirts.length; n++){
		if (meusShirts[n] == null){
			for (int m=n; m < meusShirts.length; m++ ){
				if (meusShirts[m] != null){
					meusShirts[n]=meusShirts[m];
					meusShirts[m]=null;
					break;
				}
			}
		}
	}
	
	for( Shirt s : meusShirts){
		
	
		if (s !=null)
//			System.out.println(s.Nome());
//		else
			System.out.println("-Nulo");
		
	//	System.out.println( s!=null?s.Nome():"-Nulo");
		
	}
	
	
	
	
	
	
	
}	
	
	
}
