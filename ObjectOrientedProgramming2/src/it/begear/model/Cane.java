package it.begear.model;

public class Cane extends Animale {
	
	private String razza;
	
	public Cane() {
		
	}
	
	public Cane(String nome, int eta, String proprietario, String razza) {
		super(nome, eta, proprietario);
		this.razza = razza;
	}

	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}

	@Override
	public double costoVisita() {
		return 40.0;
	}
	
	@Override
	public void mostraInformazioni() {
		super.mostraInformazioni();
		System.out.println("Razza: " + razza);
	}

}
