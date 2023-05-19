package n3exercici1;

import java.util.Scanner;

public class F1 extends Noticia {
	static Scanner entrada = new Scanner(System.in);
	private String escuderia;
	private int puntuacio; 
	private int preu;

	public F1() {
	}

	public F1(String titular, String escuderia) {
		super(titular);
		this.puntuacio = 4;
		this.preu = 100;
		this.escuderia = escuderia;	
	}
	
	public int calcularPreuNoticia(){
		
		String nom = "";
		int preuFinal = 0; 
		
		System.out.println("Introdueix l'escuderia");
		nom = entrada.next();
		
		if  (nom.equalsIgnoreCase(("Ferrari"))||nom.equalsIgnoreCase(("Mercedes"))){
			
			preuFinal = super.getPreu() + 50;		
		}
	return preuFinal;
	}
	
	
	public int calcularPunts() {
		
		String nom = "";
		int puntsFinals = 0; 
		
		System.out.println("Introdueix l'escuderia");
		nom = entrada.next();
		
		if  (nom.equalsIgnoreCase(("Ferrari"))||nom.equalsIgnoreCase(("Mercedes"))){
			
			puntsFinals = super.getPuntuacio() + 2;
				
		}
		
		return puntsFinals;
	}


}
