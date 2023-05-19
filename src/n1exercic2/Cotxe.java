package n1exercic2;

public class Cotxe {
	
	private static final String MARCA = "SEAT";
	private static String model = "ibiza";
	private final int  potencia; 

	
	public Cotxe (int potencia, String model) {
		
		this.potencia = potencia;
		Cotxe.model = model;
			
	}
	
	public static void frenar() {
		
		System.out.println("El vehicle està frenant"); 
	}
	
	
	public void accelerar() {
		
		System.out.println("El vehicle està accelerant"); 
	}

	
	public String toString() {
		return " El Cotxe és de un "+ this.MARCA+ " té una potencia de " + this.potencia +" i és el model "+ Cotxe.model;
	}
	
	
	
	
}
