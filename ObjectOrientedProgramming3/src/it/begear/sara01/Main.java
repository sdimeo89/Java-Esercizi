package it.begear.sara01;

public class Main {
	
	public static double somma(double a, double b) {
		double somma = a + b;
		return somma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// == ed equals
		
		String nome = "Sara";
		String nome2 = "Sara";
		System.out.println(nome == nome2);
		
		String nome3 = new String("Alessia");
		String nome4 = new String("Alessia");
		System.out.println(nome3 == nome4);
		System.out.println(nome3.equals(nome4));
		
		System.out.println("------------------------");
		
		// static
		
		Persona p1 = new Persona("Rino");
		Persona p2 = new Persona("Teresa");
		
		System.out.println("Il nome delle persone è " + p1.nome + " e " + p2.nome + " e la loro nazione è " + Persona.nazione);

	}

}
