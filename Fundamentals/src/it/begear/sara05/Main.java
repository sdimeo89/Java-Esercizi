package it.begear.sara05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ciclo while
		
		// somma dei numeri tra 1 a 100
		
		int numero = 1;
		int somma = 0;
		
		while(numero <= 100) {
			somma += numero;
			numero++;
		}
		System.out.println(somma);
		
		System.out.println("--------------------");
		
		// numeri pari da 1 a 20
		
		int num2 = 2;
		
		while(num2 <= 20) {
			System.out.println(num2);
			num2 += 2;
			
		}
		
		System.out.println("---------------------");
		
		// ciclo do-while
		
		// somma numeri da 1 a 50
		
		int num3 = 1;
		int somma2 = 0;
		
		do {
			somma2+= num3;
			num3++;
		} while(num3 <= 50);
		
		System.out.println(somma2);
		
		System.out.println("------------------");
		
		// numeri pari da 10 a 1
		
		int num4 = 10;
		
		do {
			System.out.println(num4);
			num4-= 2;
		} while(num4 >= 1);
		
		System.out.println("------------");
		
		// ciclo for
		
		// prodotto numeri dispari da a 1 a 15
		
		int prodotto = 1;
		
		for (int i = 1; i <= 15; i+=2) {
			prodotto *= i;
		}
		
		System.out.println(prodotto);
		
		System.out.println("----------------------");
		
		// fattoriale di un numero
		
		int fattoriale = 1;
		
		for (int i = 1; i <= 6; i++) {
			fattoriale *= i;
		}
		
		System.out.println(fattoriale);
		
		// array
		
		System.out.println("--------------");
		
		// valore massimo di array di interi
		
		int[] array = {5, 7, 15, 11, 25, 20};
		int massimo = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > massimo) {
				massimo = array[i];
			}
			
		}
		System.out.println(massimo);
		
		System.out.println("----------------");
		
		// media elementi array numeri float
		
		float[] array2 = {3.5f, 4.7f, 2.9f, 10.4f, 6.8f};
		float somma3 = 0.0f;
		
		for (int i = 0; i < array2.length; i++) {
			somma3 += array2[i];
		}
		
		float media = somma3 / array2.length;
		
		System.out.println(media);
		
		System.out.println("--------------");
		
		// for-each
		
		// numero vocali stringa
		
		String stringa = "Sono Sara";
		int cont = 0;
		
		for (char carattere : stringa.toCharArray()) {
			if (Character.toLowerCase(carattere) == 'a' || Character.toLowerCase(carattere) == 'e' || Character.toLowerCase(carattere) == 'i' || Character.toLowerCase(carattere) == 'o' || Character.toLowerCase(carattere) == 'u') {
				cont++;
			}
		}
		System.out.println(cont);
		
		System.out.println("----------------");
		
		// somma elementi array di double
		
		double[] arrayDouble = {3.6, 5.8, 2.8, 9.3, 4.7};
		double somma5 = 0;
		
		for (double numeri : arrayDouble) {
			somma5+= numeri;
		}
		
		System.out.println(somma5);
		
		
	}

}
