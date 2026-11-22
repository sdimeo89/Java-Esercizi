package it.begear.sara07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String

		// inizio con determinato prefisso

		String nome = "Sara";

		if (nome.startsWith("S")) {
			System.out.println("Il nome inizia con la lettera S");
		}

		System.out.println("----------------");

		// convertire String in maiuscolo

		String frase = "Buongiorno a tutti!";

		System.out.println(frase.toUpperCase());
		
		System.out.println("------------");
		
		//StringBuilder
		
		StringBuilder sb = new StringBuilder("Ciao a tutti");
		
		sb.append(" quanti");
		sb.append("!");
		System.out.println(sb);
		
		sb.delete(13, 20);
		System.out.println(sb);
		
		sb.insert(13, "gli amici!");
		System.out.println(sb);
		
		sb.replace(13, 23, "i parenti!");
		System.out.println(sb);
		

	}

}
