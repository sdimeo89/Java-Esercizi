package it.begear.app;

import it.begear.model.Animale;
import it.begear.model.Cane;
import it.begear.model.Gatto;
import it.begear.service.Clinica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animale cane1 = new Cane("Tobia", 5, "Simone", "Pastore tedesco");
		Animale cane2 = new Cane("Pongo", 7, "Rudy", "Dalmata");
		Animale gatto1 = new Gatto("Tigro", 3, "Michele", true);
		Animale gatto2 = new Gatto("Stella", 6, "Gianni", false);
		Clinica clinica = new Clinica();
		clinica.aggiungiAnimale(cane1);
		clinica.aggiungiAnimale(cane2);
		clinica.aggiungiAnimale(gatto1);
		clinica.aggiungiAnimale(gatto2);
		
		System.out.println("VISITA VETERINARIA");
		clinica.mostraAnimali();
		System.out.println("\nIl costo totale della visita veterinaria è di " + clinica.calcoloIncasso() + " euro");
		
		
		

	}

}
