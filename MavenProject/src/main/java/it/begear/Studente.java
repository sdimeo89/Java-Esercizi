package it.begear;

public class Studente {
	
	String nome;
	int voto;
	
	public Studente() {
		
	}
	
	public Studente (String nome, int voto) {
		this.nome = nome;
		this.voto = voto;
	}
	
	public void mostraInformazioni() {
		System.out.println("Nome: " + nome);
		System.out.println("Voto: " + voto);
	}

}
