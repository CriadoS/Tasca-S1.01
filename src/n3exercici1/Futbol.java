package n3exercici1;

import java.util.Scanner;

public class Futbol extends Noticia {
	static Scanner entrada = new Scanner(System.in);
	private String club; 
	private String competicio; 
	private String jugador; 
	private int puntuacio;
	private int preu; 
	
	
	public Futbol() { // constructor buit per crida als metodes.
		
		
	}

	public Futbol (String titular,String club,String competicio, String jugador) {
		
		super(titular);
		this.puntuacio = 5;
		this.preu = 300; 
		this.club = club; 
		this.competicio = competicio; 
		this.jugador = jugador; 
		
	}
	
	public int calcularPreuNoticia(){
		
		
		String nom = ""; 
		String nomE = "";
		String nomJ = "";
		int preuFinal = 0;
		
		System.out.println("Introdueix la competicio");
		nom = entrada.nextLine();
		System.out.println("Introdueix el club");
		nomE = entrada.next();
		entrada.next();
		System.out.println("Introdueix jugador");
		nomJ = entrada.next();
		
		
		if(nom.equalsIgnoreCase(("Lliga de campions"))){
			
			preuFinal = super.getPreu() + 100;
			
		}
		else if (nomE.equalsIgnoreCase(("Barça"))||nomE.equalsIgnoreCase(("Madrid"))){
			
			preuFinal = super.getPreu() + 100;
				
		}
		else if (nomJ.equalsIgnoreCase(("Ferran Torres"))||nom.equalsIgnoreCase(("Benzema"))){
			
			preuFinal = super.getPreu() + 50;		
		}
		
		return preuFinal;
	}
	
	public int calcularPunts() {
		
		String nom = "";
		String nomE = "";
		String nomJ = "";
		int puntsFinals = 0; 
		
		System.out.println("Introdueix la competicio");
		nom = entrada.nextLine();
		System.out.println("Introdueix el club");
		nomE = entrada.next();
		System.out.println("Introdueix jugador");
		nomJ = entrada.next();
		
		if(nom.equalsIgnoreCase(("Lliga de campions"))){	
			puntsFinals = super.getPuntuacio() + 3;
			
		}
		else if(nom.equalsIgnoreCase(("Lliga"))){
			puntsFinals = super.getPuntuacio() + 2;
			
		}
		else if (nom.equalsIgnoreCase(("Barça"))||nom.equalsIgnoreCase(("Madrid"))){	
			puntsFinals = super.getPuntuacio()  + 1;
				
		}
		else if (nom.equalsIgnoreCase(("Ferran Torres"))||nom.equalsIgnoreCase(("Benzema"))){	
			puntsFinals = super.getPuntuacio()  + 1;
				
		}
	return puntsFinals;
	}

	
	public String toString() {
		return " la noticia del futbol és del club=" + this.club + ", de la competicio " + this.competicio + ", "
				+ "i del jugador=" + this.jugador + "]";
	}
	
	
	
	
	
	

}
