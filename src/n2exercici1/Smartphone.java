package n2exercici1;

public class Smartphone extends Telefon implements Camera,Rellotge {

	public Smartphone(String marca, String model) {
		super(marca, model);
		
	}
	
	public void fotografiar() {
		
		System.out.println("s'està fent una fotografia");
	}
	
	public void alarma() {
		
		System.out.println("està sonant una alarma");
	}

}
