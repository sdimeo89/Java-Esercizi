package it.begear.sara09;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Wrapper Class, Boxing e Unboxing
		
		int a = 10; // tipo primitivo
		Integer b = 20; // Wrapper Class
		
		Integer c = a;  // Boxing: conversione da tipo primitivo a Wrapper Class
		int d = b; // Unboxing: conversione da Wrapper Class a tipo primitivo
		
		System.out.println(c + d);
		
		System.out.println("-------------------------");
		
		// Enum
		
		StatoOrdine stato = StatoOrdine.CONSEGNATO;
		
		switch (stato) {
		case IN_ATTESA:
			System.out.println("Stato: in attesa");
			break;
		case PAGATO:
			System.out.println("Stato: pagato");
			break;
		case SPEDITO:
			System.out.println("Stato: spedito");
			break;
		case CONSEGNATO:
			System.out.println("Stato: consegnato");
			break;
		}
		
		System.out.println("--------------------------");
		
		// Record
		
		Prodotto p1 = new Prodotto("Sedia", 30.0, "Nuova"); // immutabile, non può essere modificato
		System.out.println(p1.toString());

	}

}
