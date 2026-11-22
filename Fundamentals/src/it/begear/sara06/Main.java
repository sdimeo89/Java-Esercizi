package it.begear.sara06;

public class Main {

	public static void verifica(int a) {
		if (a % 2 == 0) {
			System.out.println("Il numero è pari");
		} else {
			System.out.println("Il numero è dispari");
		}
	}

	public static double valoreMassimo(double a, double b, double c) {
		final double massimo;
		if (a > b && a > c) {
			massimo = a;
		} else if (b > a && b > c) {
			massimo = b;
		} else {
			massimo = c;
		}
		return massimo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// metodi

		// verificare se un numero è pari

		verifica(4);

		System.out.println("-----------------");

		// valore massimo tra tre numeri

		double valMax = valoreMassimo(3.9, 11.8, 8.3);
		System.out.println("Il valore massimo è " + valMax);

		System.out.println("--------------------");

	}

}
