package n3exercici1;
import java.util.ArrayList;
import java.util.Scanner;

public class Redactor {
	
	private String nom; 
	private final String dni; // declarat com a constant perquè una vegada assignat el valor al constructor no es pugui modificar
	private static int sou;
	private static ArrayList<Noticia> noticies = new ArrayList <Noticia>();
	// crear un arraylist on guardar les noticies.
	
	public Redactor (String nom, String dni) {
		
		this.nom = nom; 
		this.dni = dni;
		Redactor.sou = 1500; 
	}

	public String getNom() {
		return nom;
	}

	public String getDni() {
		return dni;
	}
	
	public  int getSou() {
		return sou;
	}
	
	public ArrayList<Noticia> getNoticies() {
		 
		 return this.noticies;
	 }
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public  void setSou(int sou) {
		Redactor.sou = sou;
	}
	
	public void setNoticia(Noticia noticia) {
		
		 this.noticies.add(noticia);
			
	}

	
	public String toString() {
		return " El Redactor és diu " + this.nom + ", té un dni " + this.dni + " i el seu sou és de: " + Redactor.sou;
	}

	
	
	
	
	
	
	
	
	
	
	

}
