package Recursividade.Exercicios;

public class TesteBuscaVetores {

	public static void main(String[] args) {
		
		int vetor[] = {210,111,33,39,41,77,200};
		int menor = BuscaVetores.BuscaVetorMenor(vetor, 0, vetor.length-1);
		int maior = BuscaVetores.BuscaVetorMaior(vetor, 0, vetor.length-1);
		
		System.out.println("O menor valor do vetor é: "+menor);
		System.out.println("O maior valor do vetor é: "+maior);
	}

	

}
