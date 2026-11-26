package it.begear.model;

public class Studente {
	
	private String nome;
	private String cognome;
	private int eta;
	private String materia;
	private double voto;
	
	public Studente() {
		
	}
	
	public Studente(String nome, String cognome, int eta, String materia, double voto) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.materia = materia;
		this.voto = voto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getVoto() {
		return voto;
	}

	public void setVoto(double voto) {
		this.voto = voto;
	}

}
