package Recursividade.Exercicios;

public class TesteBuscaBinariaRecursiva {

	public static void main(String[] args) {
		
		int vetor[] = {0,1,9,22,34,45,56,77,81,93};
		int nFim = vetor.length, busca,posicao;
		busca = 93;
		posicao = BuscaBinariaRecursiva.BuscaBinaria(vetor, 0, nFim, busca);
		
		System.out.println("Procura "+busca+" encotrado na posição "+posicao);
	}

}
