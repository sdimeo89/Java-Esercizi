package it.begear.sara08;

public class Prodotto {
	
	private String nome;
	private double prezzo;
	private int quantita;
	
	public Prodotto() {
		
	}
	
	public Prodotto(String nome, double prezzo, int quantita) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantita = quantita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		if (prezzo < 0.0) {
			System.out.println("Il prezzo non può essere negativo!");
		} else {
			this.prezzo = prezzo;
		}
		
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		if (quantita < 0) {
			System.out.println("La quantità non può essere negativa!");
		} else { 
			this.quantita = quantita;
		}
	}
	
	public void stampaInformazioni() {
		System.out.println("Il nome del prodotto è: " + this.nome);
		System.out.println("Il prezzo del prodotto è: " + this.prezzo);
		System.out.println("La quantità del prodotto è: " + this.quantita);
	}
	
	public int aumentaQuantita(int numero) {
		if (numero < 0) {
			System.out.println("L'aumento della quantità non può essere negativo!");
			return quantita;
		}
		quantita += numero;
		return quantita;
	}

}
