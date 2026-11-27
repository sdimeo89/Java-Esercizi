package it.begear.model;

public class Gatto extends Animale {
	
	private boolean vaccino;
	
	public Gatto() {
		
	}
	
	public Gatto(String nome, int eta, String proprietario, boolean vaccino) {
		super(nome, eta, proprietario);
		this.vaccino = vaccino;
	}

	public boolean isVaccino() {
		return vaccino;
	}

	public void setVaccino(boolean vaccino) {
		this.vaccino = vaccino;
	}

	@Override
	public double costoVisita() {
		return 30.0;
	}
	
	@Override
	public void mostraInformazioni() {
		super.mostraInformazioni();
		System.out.println("Vaccino: " + vaccino);
	}

}
