
/**
 * 
 * @author Rui Borges
 *
 */
public class Shirt {

	public  int shirtId;
	public String nomeShirt;
	
	
	public Shirt(int opt, String nm){
		
		shirtId = opt;
		nomeShirt = nm;
	}	
		
		
		double d=12;
	
		public String Nome () {
			return nomeShirt;
		}
		
		
		//float f = 10.5F;
	//	float f= (float) 10.5;
		
		
		
	//	System.out.println(f);
		
		
		public boolean equals(Object aQuele){
			  if ( this == aQuele ) return true;
			  if ( !(aQuele instanceof Shirt) ) return false;
			  Shirt aquilo = (Shirt)aQuele;
			  return
			    EqualsUtil.areEqual(this.shirtId, aquilo.shirtId) &&
			    EqualsUtil.areEqual(this.nomeShirt, aquilo.nomeShirt); 
		
			  
			  
	}

		
	}	
	
