package it.begear.sara01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// errori di compilazione
		
		int numero = 10;
		numero = "20"; // Type mismatch: cannot convert from String to int
		System.out.println(numero);
		
		System.out.println("------------------------------");
		
		int n = 10 // Syntax error, insert ";" to complete LocalVariableDeclarationStatement
		System.out.println(n);
		
		for (int i = 0; i < 10; i++) { // Syntax error, insert "}" to complete ClassBody
			System.out.println(i);
	
		}
}
