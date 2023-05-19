package n1exercic2;

public class MainCotxe {

	public static void main(String[] args) {
		
		Cotxe cotxe1 = new Cotxe (500, "leon");
		
		Cotxe.frenar(); // afecta a tots els objectes de la classe 
		
		cotxe1.accelerar();

		System.out.println(cotxe1.toString());


	}

}
