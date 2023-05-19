package n3exercici1;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static Scanner entrada = new Scanner (System.in);
	static ArrayList<Redactor> redactors = new ArrayList<Redactor>();
	private static String nom = ""; 
	private static String dni = "";
	private static String tipus = "";
	
	public static void main(String[] args) {
				
		boolean sortir = false;
		int opcio;
			
		do{
			
			System.out.println("Introdueixi una opcio:\n1. Introdueir Redactor"+"\n2. Esborrar redactor"+
					"\n3. Introduir noticia redactor "+ "\n4. Eliminar noticia " + "\n5. Mostrar noticies per redactor"
							+ "\n6.Calcular puntuació noticia " + "\n7. Calcular preu-noticia"+ "\n8. Sortir de l'aplicació");
					
			opcio = entrada.nextInt();
			entrada.nextLine();
					
			switch(opcio) {
			 
				 case 1:
					 demanarDades();
					 crearRedactor(nom,dni);	 
					 break;
				 case 2:
					 demanarDades();
					 eliminarRedactor(nom,dni);
					 break;
				 case 3:
					 demanarDades();
					 ficarNoticia(nom, dni); 
					 break;
				 case 4:
					 demanarDades();
					 eliminarNoticia(nom,dni);
					 break;
				 case 5:
					 demanarDades();
					 mostrarNoticia(nom, dni);
					 break;
				 case 6:
					 demanarTipus();
					 calcularPreu(tipus);
					 break;
				 case 7:
					 demanarTipus();
					 calcularPunts(tipus);
					 break;
				 case 8:
					 sortir = true;	
					default:
						System.out.println("Introdueixi una opció vàlida");		 			
			}
		
		}while(!sortir);
	
	}
	
	public static void demanarDades() {
		
		System.out.println("Introdueix el nom");
		nom = entrada.nextLine();
		System.out.println("Introdueixi el DNI");
		dni = entrada.nextLine();
		
	}
	
	public static void demanarTipus() {
		System.out.println("Introdueix el tipus de noticia");
		tipus = entrada.nextLine();
	
	}

	public static Redactor crearRedactor(String nom, String dni) {
		
		String nomGuardat;
		String dniGuardat;
		Redactor nouRedactor = null;
		boolean existeix = false;
						
		// Controlar que el redactor no estigui repetit 
		
		for(int i = 0; i < redactors.size(); i++) {
			
			System.out.println(redactors.get(i).getNom());
			
			nomGuardat = redactors.get(i).getNom();
			dniGuardat =  redactors.get(i).getDni();
			
			if(nomGuardat.equalsIgnoreCase(nom) && (dniGuardat.equalsIgnoreCase(dni))) {
								
				System.out.println("El redactor introduit ja existeix");	
				
				existeix = true;
			}	
		}
		if (!existeix) { // Crea el redactor si no existeix
			
			nouRedactor = new Redactor (nom, dni);
			
			redactors.add(nouRedactor);
			
			for (Redactor r: redactors) {
				
				System.out.println(redactors);
			}
							
		}
		return  nouRedactor;
	
	}
	
	public static void eliminarRedactor(String nom, String dni) {
		
		String nomGuardat;
		String dniGuardat;
		boolean trobat = false; 
		int i = 0;
		Redactor redactorTrobat;		
		
		while((i < redactors.size())&&(!trobat)) {
			
			System.out.println(redactors.get(i).getNom());
			
			nomGuardat = redactors.get(i).getNom();
			dniGuardat =  redactors.get(i).getDni();
			
			if(nomGuardat.equalsIgnoreCase(nom) && (dniGuardat.equalsIgnoreCase(dni))) {
				
				redactorTrobat = redactors.get(i); // guardar l'objecte trobat 
				redactors.remove(redactorTrobat);
				
				System.out.println("S'ha esborrat amb exit");
				trobat = true; 
			}
			else {
				System.out.println("El redactor no està aplicació");  
				trobat = false;
			}
			
		i++;
		}
			
	}
	
	public static void ficarNoticia(String nom, String dni) {
	 
		String nomGuardat;
		String dniGuardat;
		String tipus;
		String titular;
		String competicio;
		String club;
		String jugador;
		String escuderia;
		String equip;
		String tenista;
		int puntuacio;
		int preu;
		boolean trobat = false;
		boolean noRegistre = false;
		int i = 0;
		Redactor redactorTrobat;
		
				
		while((i < redactors.size())&&(!trobat)) {
			
			System.out.println(redactors.get(i).getNom());
			
			nomGuardat = redactors.get(i).getNom();
			dniGuardat =  redactors.get(i).getDni();
			
			if(nomGuardat.equalsIgnoreCase(nom) && (dniGuardat.equalsIgnoreCase(dni))) {
				
				redactorTrobat = redactors.get(i);
				
				// demanar quin tipus de noticia i valors 
				System.out.println("Quin tipus de noticia vols introduir"); 
				tipus = entrada.nextLine();			
				System.out.println("digues el titular"); 
				titular = entrada.nextLine();
				//entrada.nextLine();
				System.out.println("digues la competicio"); 
				competicio = entrada.nextLine();
				
				 switch (tipus) {
					 
					 case "Basquet":
						 // crear noticia de basquet	
						 System.out.println("digues el club"); 
						 club = entrada.nextLine();
						 Basquet noticiaB = new Basquet(titular,competicio,club);
						 redactors.get(i).setNoticia(noticiaB);
						 redactors.get(i).getNoticies();
						 System.out.println("s'ha creat una noticia de basquet correctament"); 
						 break;
					 case"Futbol":
						 System.out.println("digues el club"); 
						 club = entrada.nextLine();
						 System.out.println("digues el jugador"); 
						 jugador = entrada.nextLine();
						 Futbol noticiaF = new Futbol(titular,club,competicio,jugador);
						 redactors.get(i).setNoticia(noticiaF);
						 System.out.println("s'ha creat una noticia de Futbol correctament"); 
						 break;
					 case"F1":
						 System.out.println("digues l'escuderia");
						 escuderia = entrada.nextLine();
						 F1 noticiaF1 = new F1(titular, escuderia);
						 redactors.get(i).setNoticia(noticiaF1);
						 System.out.println("s'ha creat una noticia de F1 correctament"); 
						 break;
					 case"Motociclisme":
						 System.out.println("digues l'equip");
						 equip = entrada.nextLine();
						 Motociclisme moto1 = new Motociclisme(titular,equip);
						 redactors.get(i).setNoticia(moto1);
						 System.out.println("s'ha creat una noticia de motociclisme correctament"); 
						 break;
					 case"Tenis":
						 System.out.println("digues el tenista");
						 tenista = entrada.nextLine();
						 Tenis noticiaTenis = new Tenis(titular, competicio, tenista);
						 redactors.get(i).setNoticia(noticiaTenis);
						 System.out.println("s'ha creat una noticia de tenis correctament"); 
						 break;	 
				 }
				 trobat = true; 
			}
			else {
				
				noRegistre = true;
			}
			
		i++;
		}
		if (noRegistre) {
			
			System.out.println("El redactor no es troba a l'aplicació");
		}		
			
	}
	
	public static void eliminarNoticia(String nom, String dni) {
		
		String nomGuardat;
		String dniGuardat;
		String titularUser;
		String guardarTitular;
		boolean trobat = false; 
		int i = 0;
		int j = 0; 
		Redactor redactor1;	
		
		System.out.println("introdueixi el titular de la noticia");
		titularUser = entrada.nextLine();
		
		while((i < redactors.size()) && (!trobat)) {
			
			System.out.println(redactors.get(i).getNom());
			
			nomGuardat = redactors.get(i).getNom();
			dniGuardat =  redactors.get(i).getDni();
			
			redactor1 = redactors.get(i); // creo objecte redactor on guardar-lo
			
			if(nomGuardat.equalsIgnoreCase(nom) && (dniGuardat.equalsIgnoreCase(dni))) {
				
				// buscar el titular 
				
				while (( j < redactor1.getNoticies().size())){
					
					guardarTitular = redactor1.getNoticies().get(j).getTitular(); // ja tinc el titular 
					
					if(titularUser.equalsIgnoreCase(guardarTitular)) { //comparo
						
						redactor1.getNoticies().remove(j); // elimino la noticia
						
						System.out.println("S'ha eliminat amb exit ");
							
					}
					else {
						
						System.out.println("El titular no és correcte");
					}
					j++;
						
				}
				System.out.println(redactors.get(i).getNoticies());
				
				trobat = true; 
			}
			else {
				System.out.println("El redactor no està aplicació");  
				trobat = false;
			}
			
		i++;
		}
		
	}
	public static void mostrarNoticia(String nom, String dni) {
		
		String nomGuardat;
		String dniGuardat;
		String titularUser;
		String guardarTitular;
		boolean trobat = false; 
		int i = 0;
		int j = 0; 	
		
		while((i < redactors.size()) && (!trobat)) {
			
			System.out.println(redactors.get(i).getNom());
			
			nomGuardat = redactors.get(i).getNom();
			dniGuardat =  redactors.get(i).getDni();
			
			Redactor redactor1 = redactors.get(i); // creo objecte redactor on guardar-lo
			
			if(nomGuardat.equalsIgnoreCase(nom) && (dniGuardat.equalsIgnoreCase(dni))) {
				
				System.out.println(redactor1.getNoticies());
			}
			else {
				System.out.println("El redactor no està aplicació");  
				trobat = false;
			}
			
		i++;
		}
		
	}
	public static void calcularPreu(String tipus) {
		
		int i = 0; 
		boolean trobat = false;
	
		switch (tipus) {
		
			 case "Basquet": //Calcular els punts de basquets 
				 Basquet basquetN = new Basquet(); // creo una noticia 
				 System.out.println("La noticia té un preu de " + basquetN.calcularPreuNoticia() + " euros." );	 
				 break;
			 case"Futbol": 
				 Futbol futbolN = new Futbol (); 
				 System.out.println("La noticia té un preu de " +futbolN.calcularPreuNoticia() +" euros.");  
				 break;
			 case"F1": 
				 F1 formula1 = new F1();
				 System.out.println("La noticia té un preu de "+ formula1.calcularPreuNoticia()+ " euros. "); 
				 break;
			 case"Motociclisme": 
				 Motociclisme moto = new Motociclisme();
				 System.out.println("La noticia té un preu de "+ moto.calcularPreuNoticia() + " euros. ");
				 break;
			 case"Tenis": 
				 Tenis tenisN = new Tenis();
				 System.out.println("La noticia té un preu de "+ tenisN.calcularPreuNoticia() + " euros. ");
				 break;	 
			default:
				System.out.println("Aquest tipus de notícia no existeix");
			}
		
	}
	public static void calcularPunts(String tipus) {
		
		int i = 0; 
		boolean trobat = false;
	
		switch (tipus) {
		
			 case "Basquet": //Calcular els punts de basquets 
				 Basquet basquetN = new Basquet(); // creo una noticia 
				 System.out.println("La noticia té una puntuació de " + basquetN.calcularPunts());	 
				 break;
			 case"Futbol": 
				 Futbol futbolN = new Futbol (); 
				 System.out.println("La noticia té una puntuació de " + futbolN.calcularPunts());  
				 break;
			 case"F1": 
				 F1 formula1 = new F1();
				 System.out.println("La noticia té una puntuació de "+ formula1.calcularPunts()); 
				 break;
			 case"Motociclisme": 
				 Motociclisme moto = new Motociclisme();
				 System.out.println("La noticia té una puntuació de "+ moto.calcularPunts());
				 break;
			 case"Tenis": 
				 Tenis tenisN = new Tenis();
				 System.out.println("La noticia té una puntuació de "+ tenisN.calcularPunts());
				 break;	 
			default:
					System.out.println("Aquest tipus de notícia no existeix");
			}
		
	}
		
}
