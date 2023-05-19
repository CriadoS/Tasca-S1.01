package n1exercici1;

public class Corda extends Instrument{

	public Corda(String nom, float preu) {
		super(nom, preu);
		
	}
	
	
	public void tocar() {
		
		System.out.println("Està tocant un instrument de corda");
	}
	static {
		
		System.out.println("S'ha iniciliatzat un instrument de corda");
		
	}
	public static void metode() {
		
		System.out.println("Soc un mètode estàtic");
		
		
	}


}
