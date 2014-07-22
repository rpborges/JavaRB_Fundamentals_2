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
		
		int a = 2147483647;
		int b = 2147483647;
		int c = a + b;
		long d = a + b;
		long e = (long) a + (long) b;
		long f = 2147483647;
		long g = a + f;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(g);
		
		
		int h = 5;
		int i = 2;
		System.out.println(h/i);

		double j = 5;
		double k = 2;
		System.out.println(j % k);
	
		int l = 6;
		int m = ++l;
		
		System.out.println("l:"+l+" m:"+m);
				
		int o = 6;
		int p = o++;
		
		System.out.println("o:"+o+" p:"+p);
				
		
		l = 15;
		m = l+++l;
		System.out.println("l:"+l+" m:"+m);

		l = 15;
		m = (l++)+l;
		System.out.println("l:"+l+" m:"+m);

		l = 15;
		m = l+(++l);
		System.out.println("l:"+l+" m:"+m);
		
		
		l = 15;
		m = (++l)+l;
		System.out.println("l:"+l+" m:"+m);

		l = 15;
	int	l1 = 10;
		m = l+++l1;
		System.out.println("l:"+l+" l1:"+l1+" m:"+m);

		l = 15;
		l1 = 10;
		m = (l++)+l1;
		System.out.println("l:"+l+" l1:"+l1+" m:"+m);
		l = 15;
		
		l1 = 10;
		m = l+(++l1);
		System.out.println("l:"+l+" l1:"+l1+" m:"+m);

		
		
		
		
		
		
		
	}

}
