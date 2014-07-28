


public class Calcas extends Roupa {

	private String cTamanho;
	private final String cTipo = "Calças";
	
	
	
	public Calcas(String marca, int id, String nome, String tamanho){
		super( marca,  id,  nome);
		cTamanho= tamanho;
	}
	
	public Calcas(String marca, int id, String nome, String cor, double preco, String tamanho ) {
		super( marca,  id,  nome,  cor,  preco );
		cTamanho= tamanho;
	}

	public String getTamanho() {
		return cTamanho;
	}

	public void setTamanho(String cTamanho) {
		this.cTamanho = cTamanho;
	}

	
	public String display(){
		StringBuilder sb = new StringBuilder( super.display());
		sb.append("  Tipo: " + cTipo + ", Tam: " + cTamanho+ "\n");
		return sb.toString();
			
	}
	
	@Override
	public  String getTipo(){
		return cTipo;
	}
	
	
	
	
	
	
	
}
