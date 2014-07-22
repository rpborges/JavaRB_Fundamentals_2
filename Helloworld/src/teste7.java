/**
 * 
 * @author Rui Borges
 * Sessão 5 Unidade 7	
 * 2014-07-17
 *
 */
public class teste7 {

	private String nome = "";
	private int idade = 0;
	
	public teste7(String Nome, int Idade) {
		
		if (Nome.length() > 0)
			nome=Nome;
		
		if (Nome.length() > 0) {
			if (Idade > 0)
				idade = Idade;
		}
	}
	
	
	public boolean nomePreenchido() {
		return nome.length() > 0 ? true : false;
	}
	
	public boolean Adulto() {
		return idade > 17 ? true : false;
	}
	
	public String Escalao() {
		if (idade > 0) {
			
			switch(idade){
			case 10:
				return "A";
			case 20:
				return "B";
			default:
				return "O";
			}
		}
			else
				return "0";
		
	}
	
	
	
	
	
	
	
}
