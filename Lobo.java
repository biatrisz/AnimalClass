package Animalclass;

public class Lobo extends Animal {

	public Lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);	
	}
	@Override 
	public void emitirSom() {
		System.out.println("lobo está uivando");
	}
}
