
public class Teste_8_arrays {

	public static void main(String[] args) {

//		int[] meusInts = new int[10];
//		String[] meusStrings = new String[7];
		Shirt[] meusShirts = new Shirt[3];

//		int teste[] = { 1, 2, 3, 4, 5 };

		// int [] [] matriz = new int [4] [7];
		int[][] matriz = { { 11, 12, 13, 14, 15, 16, 17 },
				{ 21, 22, 23, 24, 25, 26, 27 }, { 31, 32, 33, 34, 35, 36, 37 },
				{ 41, 42, 43, 44, 45, 46, 47 } };
		
		int y[] = { 11, 12, 13, 14, 15, 16, 17 };

		int[][] x = new int[4][];
		x[0] = y;
		x[1] = new int[7];
		x[2] = new int[1];
		x[2][0] = 99;
		
		
		meusShirts[0] = new Shirt("Marca",0, "Azul");
		meusShirts[1] = new Shirt("Marca",1, "Amarelo");
		meusShirts[2] = new Shirt("Marca",2, "Ambar");

		System.out.println(matriz.length + "  " + matriz[0].length + "  "
				+ matriz[2][3] + "  " + x[0][3] + "  " + x[2][0]);

	}
}
