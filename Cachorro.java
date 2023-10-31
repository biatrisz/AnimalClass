package Animalclass;

public class Cachorro extends Animal{

	public Cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
		
	}
	public void emitirSom() {
		System.out.println("O cachorro late");
	}

}
