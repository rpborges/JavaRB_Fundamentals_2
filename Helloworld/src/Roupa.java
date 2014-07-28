
public abstract class Roupa {

	private int rid;
	private String rnome;
	private String rcor;
	private double rpreco;
	private final String rmarca;
	
	
	public Roupa(String marca, int id, String nome){
		super();
		rmarca = marca;
		rid = id;
		rnome = nome;
	}
	
	public Roupa(String marca, int id, String nome, String cor, double preco ) {
		this(marca, id, nome);
		rcor=cor;
		rpreco=preco;
	}


	public int getId() {
		return rid;
	}

	public void setId(int rid) {
		this.rid = rid;
	}

	public String getNome() {
		return rnome;
	}

	public void setNome(String rnome) {
		this.rnome = rnome;
	}

	public String getCor() {
		return rcor;
	}

	public void setCor(String rcor) {
		this.rcor = rcor;
	}

	public double getPreco() {
		return rpreco;
	}

	public void setPreco(double rpreco) {
		this.rpreco = rpreco;
	}

	
	public String display(){
		StringBuilder sb = new StringBuilder("Marca: " + rmarca + "\n");
		sb.append(rnome ).append(" Preço: " + rpreco + "\n");
		return sb.toString();
	}
	
	protected abstract String getTipo();
	
	
	
}
