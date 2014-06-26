/**
 * A minha primeira aplicação Java
 * 
 * @author Rui Borges
 * 
 */
public class app {

	public static void main(String[] args) {
		// vou imprimir
		System.out.println("HELLO");
		for (int i = 0; i < args.length; i++)
			if (i < args.length - 1)
				System.out.print(args[i] + " - ");
			else
				System.out.print(args[i]);
		
		System.out.println();

		for (int i = 0; i < args.length; i++)
			System.out.print(args[i] + ((i == args.length - 1) ? "" : " "));

		System.out.println();
	}

}
