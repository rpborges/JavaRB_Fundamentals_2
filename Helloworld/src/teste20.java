
public class teste20 {

	public static void main(String[] args) {
		
		
		Calcas cl = new Calcas("AGATI", 2, "CHINO ", "Azul", 123.25, "E46 M8");
		Calcas cl2 = new Calcas("Armani", 3, "Calça Homem","XXL");
		cl2.setPreco(49.99);

		Camisa cl3 = new Camisa("REGOJO", 2, "BASICO ", "BRANCO", 75.00, "L");
		Camisa cl4 = new Camisa("Armani", 3, "HAITI","XXL");
		cl4.setPreco(75.50);

		System.out.println(cl.display());
		System.out.println(cl3.display());
		System.out.println(cl2.display());
		System.out.println(cl4.display());
		
		System.out.println(new Calcas("INOVE", 5, "TESTE CALÇAS ", "Castanho", 135, "M").display());
	}
}
