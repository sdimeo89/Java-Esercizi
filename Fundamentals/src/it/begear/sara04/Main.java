package it.begear.sara04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// operatore ternario
		
		int x = 5;
		int y = 10;
		
		int valMinimo = x < y ? x : y;
		System.out.println(valMinimo);
		
		System.out.println("-----------------");
		
		// if-else
		
		if (x < y) {
			System.out.println("X è più piccolo di Y");
		} else if (x == y) {
			System.out.println("X è uguale a Y");
		} else {
			System.out.println("X è più grande di Y");
		}
		
		System.out.println("-------------------");
		
		// switch
		
		String giorno = "mercoledi";
		
		switch (giorno) {
			case "lunedi":
				System.out.println("Il giorno è lunedi");
				break;
			case "martedi":
				System.out.println("Il giorno è martedi");
				break;
			case "mercoledi":
				System.out.println("Il giorno è mercoledi");
				break;
			case "giovedi":
				System.out.println("Il giorno è giovedi");
				break;
			case "venerdi":
				System.out.println("Il giorno è venerdi");
				break;
			case "sabato":
				System.out.println("Il giorno è sabato");
				break;
			case "domenica":
				System.out.println("Il giorno è domenica");
				break;
			default:
				System.out.println("Giorno inesistente");
		}
	}

}
