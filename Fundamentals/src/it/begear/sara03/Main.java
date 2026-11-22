package it.begear.sara03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// incremento (pre e post)
		
		int numero = 5;
		
		System.out.println(++numero);
		System.out.println(numero);
		
		int numero2 = 5;
		System.out.println(numero2++);
		System.out.println(numero2);
		
		System.out.println("----------------------");
		
		// copie valori
		
		final int x;
		int y = 10;
		x = y;
		
		System.out.println(x);
		
		System.out.println("---------------");
		
		int val1 = 4;
		int val2 = val1;
		val1 = 5;
		val2 = 6;
		
		System.out.println(val1);
		System.out.println(val2);
		
		System.out.println("--------------");
		
		// casting implicito e esplicito
		
		int a = 50;
		long b = a;
		System.out.println(b);
		
		long c = 70L;
		int d = (int) c;
		System.out.println(d);
		

	}

}
