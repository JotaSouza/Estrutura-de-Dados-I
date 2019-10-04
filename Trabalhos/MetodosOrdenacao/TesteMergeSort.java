package Trabalhos.MetodosOrdenacao;
import java.util.Random;

public class TesteMergeSort {

	public static void main(String[] args) {
		
		MergeSort merge = new MergeSort();
		
		//executa a operação com vetor ordenado de 10.000 elementos
		int[] vetor = new int[10000];
		for (int i : vetor) {
			vetor[i] = i;
		}
		merge.ordena(vetor, 0, vetor.length-1);
		System.out.println("Vetor ordenado com 10.000 elementos");
		
	}

}
