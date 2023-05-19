package n1exercici1;

public  class Percussio extends Instrument {

	public Percussio(String nom, float preu) {
		super(nom, preu);
		
	}
	
	public void tocar() {
		
		System.out.println("Està tocant un instrument de percussió");
		
	}
	static {
		
		System.out.println("S'ha iniciliatzat un instrument de percussió");
		
	}
	public static void metode() {
		
		System.out.println("Soc un mètode estàtic");
		
	}

}
