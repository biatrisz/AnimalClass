package Animalclass;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("max", "F","husky");
		lobo.emitirSom();
		
		Leao leao = new Leao("rei leão","M", "qualquer");
		leao.emitirSom();
		
		Tigre tigre = new Tigre("juma", "F", "qualquer");
		tigre.emitirSom();
		
		Cachorro cachorro = new Cachorro ("princesa", "F", "pitbul");
		cachorro.emitirSom();
		
		Gato gato = new Gato("Jiji", "M", "gato preto");
		gato.emitirSom();
	}

}
