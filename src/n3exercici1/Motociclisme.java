package n3exercici1;

import java.util.Scanner;

public class Motociclisme extends Noticia {
	static Scanner entrada = new Scanner(System.in);
	private String equip;
	private int puntuacio; 
	private int preu;
   
	public Motociclisme() {	
	}

	public Motociclisme(String titular, String equip) {
		super(titular); 
		this.puntuacio = 3; 
		this.preu = 100;
		this.equip = equip;	
	}
	
	public int calcularPreuNoticia(){
	
		int preuFinal = 0; 
		String nom = "";
		
		System.out.println("Introdueix la marca");
		nom = entrada.next();
		
		if  (nom.equalsIgnoreCase(("Yamaha"))||nom.equalsIgnoreCase(("Honda"))){
			
			preuFinal = super.getPreu() + 50;
				
		}
		return preuFinal;
	}
	
	
	public int calcularPunts() {
		
		int puntsFinals = 0;
		String nom = "";
		
		System.out.println("Introdueix la marca");
		nom = entrada.next();
		
		if (nom.equalsIgnoreCase(("Yamaha"))||nom.equalsIgnoreCase(("Honda"))){
			
			puntsFinals = super.getPuntuacio() + 3;
				
		}
	return puntsFinals;
	}

	

}
