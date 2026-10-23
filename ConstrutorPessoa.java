package Pessoa;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		
		Pessoa13 jogador1 = new Pessoa13 ();
		Pessoa13 jogador2 = new Pessoa13 ("Lula", 80);
		Pessoa13 jogador3 = new Pessoa13 ("Flavio");
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		System.out.println(jogador3.getNome());
		
		jogador1.setNome ("Ronaldo");
		

	}

}
