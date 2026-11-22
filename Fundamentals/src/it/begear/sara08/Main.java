package it.begear.sara08;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// classi, incapusalamento e costruttori
		
		// gestione di un prodotto
		
		Prodotto prodotto = new Prodotto("Computer", 750.0, 5);
		
		prodotto.stampaInformazioni();
		
		prodotto.setPrezzo(500.0);
		
		prodotto.aumentaQuantita(3);
		
		prodotto.stampaInformazioni();
		
		

	}

}
