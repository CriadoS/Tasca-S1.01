package n3exercici1;

import java.util.Scanner;

public class Basquet extends Noticia {
	static Scanner entrada = new Scanner(System.in);
	private String club; 
	private String competicio; 
	private int puntuacio; 
	private int preu;
	
	public Basquet() {
		
	}

	public Basquet(String titular, String competicio, String club) {
		super(titular); 
		this.puntuacio = 4;
		this.preu = 250;
		this.competicio = competicio;
		this.club = club; 
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
		
		if(nom.equalsIgnoreCase(("Eurolliga"))){
			
			preuFinal = super.getPreu() + 75;
			
		}
		else if (nomE.equalsIgnoreCase(("Barça"))||nomE.equalsIgnoreCase(("Madrid"))){
			
			preuFinal = super.getPreu() + 75;
				
		}

		return preuFinal;
	}
	
	
	public int calcularPunts() {
		
		String nom = ""; 
		String nomE = "";
		int puntsFinals = 0; 
		
		System.out.println("Introdueix la competicio");
		nom = entrada.nextLine();
		System.out.println("Introdueix el club");
		nomE = entrada.next();
		
		if(nom.equalsIgnoreCase(("Eurolliga"))){
			
			puntsFinals = super.getPuntuacio() + 3;	
		}
		else if(nom.equalsIgnoreCase(("ACB"))){
			
			puntsFinals = super.getPuntuacio() + 2;
			
		}
		else if (nom.equalsIgnoreCase(("Barça"))||nom.equalsIgnoreCase(("Madrid"))){
			
			puntsFinals = super.getPuntuacio()  + 1;
				
		}
		
	return puntsFinals;
	}
    
	

}
