package it.begear.model;

public abstract class Animale {
	
	private String nome;
	private int eta;
	private String proprietario;
	
	public Animale() {
		
	}
	
	public Animale(String nome, int eta, String proprietario) {
		this.nome = nome;
		this.eta = eta;
		this.proprietario = proprietario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	public abstract double costoVisita();
	
	public void mostraInformazioni() {
		System.out.println("\nNome: " + nome + "\nEtà: " + eta + "\nProprietario: " + proprietario);
	}

}
