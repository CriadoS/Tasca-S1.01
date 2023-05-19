package n1exercici1;

public  class  Vent extends Instrument {

	public Vent(String nom, float preu) {
		super(nom, preu);
		
	}
	
	public void tocar() {
		
		System.out.println("Està tocant un instrument de vent");
	}
	
	static {
	
		System.out.println("S'ha iniciliatzat un instrument de vent");
		
	}
	
	public static void metode() {
		
		System.out.println("Soc un mètode estàtic");
		
		
		
	}

}
