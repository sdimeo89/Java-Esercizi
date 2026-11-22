package it.begear.sara03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 10; // variabile locale che si trova nello Stack
		
		Persona p1 = new Persona(); // p1: riferimento locale nello Stack // new Persona(): crea un oggetto nell'Heap
		p1.nome = "Luca";
		Persona p2 = p1; // p2 punta allo stesso oggetto di p1, non viene creato un nuovo oggetto Persona
		
		System.out.println(p1.nome  + " " + p2.nome);
		
		System.out.println("------------------------------------");
		
		Persona p3 = new Persona();
		p3.nome = "Marco";
		
		Persona p4 = new Persona();
		p4.nome = "Sara";
		
		Persona p5 = p3;
		
		p3.nome = "Giovanni"; // p5 punta a p3, quindi la modifica avviene anche per p5
		
		System.out.println(p3.nome  + " " + p4.nome + " " + p5.nome);
		
		System.out.println("------------------------------");
		
		Persona p6 = new Persona();
		p6.nome = "Alessia";
		
		Persona p7 = p6;
		
		p7 = new Persona(); // viene creato un secondo oggetto Persona nell'Heap e il riferimento p2 viene modificato per puntare al nuovo oggetto
		p7.nome = "Mario";
		
		System.out.println(p6.nome + " " + p7.nome);

	}

}
