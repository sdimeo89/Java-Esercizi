package it.begear.service;

import it.begear.model.Studente;

public class GestioneStudenti {
	
	public void pubblicaDati(Studente s1, Studente s2) {
		System.out.println("Studente 1: \nNome: " + s1.getNome() + "\nCognome: " + s1.getCognome() + "\nEtà: " + s1.getEta() + "\nMateria: "  + s1.getMateria() + "\nVoto: " + s1.getVoto());
		System.out.println("Studente 2: \nNome: " + s2.getNome() + "\nCognome: " + s2.getCognome() + "\nEtà: " + s2.getEta() + "\nMateria: "  + s2.getMateria() + "\nVoto: " + s2.getVoto());
	}

}
