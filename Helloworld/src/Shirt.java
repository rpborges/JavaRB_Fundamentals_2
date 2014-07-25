
/**
 * 
 * @author Rui Borges
 * 
 */
public class Shirt {

	private int shirtId;
	private String nomeShirt;
	private String corShirt;
	private double precoShirt;
	private final String brandShirt;
	
	
	
	public Shirt(String brd, int opt, String nm) {
		brandShirt = brd;
		shirtId = opt;
		nomeShirt = nm;
	}

	public Shirt(String brd, int opt, String nm, String cor, double preco) {
		brandShirt = brd;
		shirtId = opt;
		nomeShirt = nm;
		corShirt = cor;
		precoShirt = preco;
	}

	double d = 12;

	public String getNome() {
		return nomeShirt;
	}
	
	public void setNome(String nm) {
		nomeShirt = nm;
	}

	public int getId() {
		return shirtId;
	}
	
	public void setId(int opt) {
		shirtId = opt;
	}

	
	
	
	public void imprime(){
		System.out.println(brandShirt + "\n" + nomeShirt);	
	}
	
	
	// float f = 10.5F;
	// float f= (float) 10.5;

	// System.out.println(f);

	public boolean equals(Object aQuele) {
		if (this == aQuele)
			return true;
		if (!(aQuele instanceof Shirt))
			return false;
		Shirt aquilo = (Shirt) aQuele;
		return EqualsUtil.areEqual(this.shirtId, aquilo.shirtId)
				&& EqualsUtil.areEqual(this.nomeShirt, aquilo.nomeShirt);

	}

}
