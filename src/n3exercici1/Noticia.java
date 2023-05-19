package n3exercici1;

public abstract class Noticia {
	
	
	private String titular; 
	private String text;
	private int puntuacio; 
	private int preu; 
	
	public Noticia() {
		
	}
	
	public Noticia (String titular) {
		
		this.titular = titular;
		this.text = ""; 
		this.puntuacio = 0; 
		this.preu = 0;
		
	}
	
	
	public String getTitular() {
		return titular;
	}

	public String getText() {
		return text;
	}

	
	public int getPuntuacio() {
		return puntuacio;
	}


	public int getPreu() {
		return preu;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public void setText(String text) {
		this.text = text;
	}


	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}


	public void setPreu(int preu) {
		this.preu = preu;
	}


	public abstract int calcularPreuNoticia();
	
	
	public abstract int  calcularPunts();


    
	public String toString() {
		return " la noticia  té un titular: " + this.titular + ",  un text: " + this.text + ", una puntuació " + this.puntuacio + 
				",  i un preu de:" + this.preu + "";
	} 
	
	
	
	

}
