package n3exercici1;

import java.util.Scanner;

public class Tenis extends Noticia{
	static Scanner entrada = new Scanner(System.in);
	private String competicio;
	private String tenista;
	private int puntuacio; 
	private int preu;

    public Tenis() {
    	
    }
	public Tenis(String titular, String competicio, String tenista) {
		super(titular);
		this.puntuacio = 4;
		this.preu = 150;
		this.competicio = competicio; 
		this.tenista = tenista;
		
	}
	
	public int calcularPreuNoticia(){
		
		String nom = "";
		int preuFinal = 0; 
		
		System.out.println("Introdueix el tenista");
		nom = entrada.next();
			
		if(nom.equalsIgnoreCase(("Federer"))||nom.equalsIgnoreCase(("Nadal"))||nom.equalsIgnoreCase(("Djokovic"))){
			
			preuFinal = super.getPreu() + 100;
				
		}

	return preuFinal;
	}
	
	public int calcularPunts() {
		
		String nom = "";
		int puntsFinals = 0; 
		
		System.out.println("Introdueix el tenista");
		nom = entrada.next();
		
		if (nom.equalsIgnoreCase(("Federer"))||nom.equalsIgnoreCase(("Nadal"))||nom.equalsIgnoreCase(("Djokovic"))) {
			
			puntsFinals = super.getPuntuacio() + 3;
				
		}
		
		return puntsFinals;
	}

}
