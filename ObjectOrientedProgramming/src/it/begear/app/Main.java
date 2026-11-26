package it.begear.app;

import it.begear.model.Studente;
import it.begear.service.GestioneStudenti;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studente s1 = new Studente("Paolo", "Manfredi", 15, "Italiano", 8);
		Studente s2 = new Studente("Martina", "Galli", 16, "Matematica", 9);
		GestioneStudenti g = new GestioneStudenti();
		g.pubblicaDati(s1, s2);

	}

}
