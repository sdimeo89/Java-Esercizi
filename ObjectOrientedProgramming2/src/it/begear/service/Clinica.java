package it.begear.service;

import java.util.ArrayList;

import it.begear.model.Animale;

public class Clinica {

	ArrayList<Animale> animali = new ArrayList<>();
	
	public void aggiungiAnimale(Animale animale) {
		animali.add(animale);
	}

	public void mostraAnimali() {
		for (Animale animale : animali) {
			animale.mostraInformazioni();
		}
	}

	public double calcoloIncasso() {
		double somma = 0;
		for (Animale animale : animali) {
			somma += animale.costoVisita();
		}
		return somma;
	}
}
