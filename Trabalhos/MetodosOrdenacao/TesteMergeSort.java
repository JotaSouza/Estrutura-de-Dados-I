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
		System.out.println("Comparações: " + merge.getComparar());
		System.out.println("Nº de trocas: " + merge.getTrocar());
		System.out.println("Tempo gasto na operação: " + (double) (merge.getTempoFim() - merge.getTempoIni()) / (Math.pow(1000, 3))+" milissegundos\n");
	
		//executa a operação com vetor ordenado de 100.000 elementos
		vetor = new int[100000];
		for (int i : vetor) {
			vetor[i] = i;
		}
		merge = new MergeSort();
		merge.ordena(vetor, 0, vetor.length-1);
		System.out.println("Vetor ordenado com 100.000 elementos");
		System.out.println("Comparações: " + merge.getComparar());
		System.out.println("Nº de trocas: " + merge.getTrocar());
		System.out.println("Tempo gasto na operação: " + (double) (merge.getTempoFim() - merge.getTempoIni()) / (Math.pow(1000, 3))+" milissegundos\n");
		
		//executa a operação com vetor invertido de 10.000 elementos
		vetor = new int[10000];
		int j = 0;
		for(int i = vetor.length - 1; i >= 0; i--) {
			vetor[j] = i;
			j++;
		}
		merge = new MergeSort();
		merge.ordena(vetor, 0, vetor.length-1);
		System.out.println("Vetor invertido com 10.000 elementos");
		System.out.println("Comparações: " + merge.getComparar());
		System.out.println("Nº de trocas: " + merge.getTrocar());
		System.out.println("Tempo gasto na operação: " + (double) (merge.getTempoFim() - merge.getTempoIni()) / (Math.pow(1000, 3))+" milissegundos\n");
		
		//executa a operação com vetor invertido de 100.000 elementos
		vetor = new int[100000];
		j = 0;
		for(int i = vetor.length - 1; i >= 0; i--) {
			vetor[j] = i;
			j++;
		}
		merge = new MergeSort();
		merge.ordena(vetor, 0, vetor.length-1);
		System.out.println("Vetor invertido com 100.000 elementos");
		System.out.println("Comparações: " + merge.getComparar());
		System.out.println("Nº de trocas: " + merge.getTrocar());
		System.out.println("Tempo gasto na operação: " + (double) (merge.getTempoFim() - merge.getTempoIni()) / (Math.pow(1000, 3))+" milissegundos\n");
	
		//executa a operação com vetor aleatório de 10.000 elementos
		vetor = new int[10000];
		Random rand = new Random();
		for (int i : vetor) {
			vetor[i] = rand.nextInt(vetor.length);
		}
		merge = new MergeSort();
		merge.ordena(vetor, 0, vetor.length-1);
		System.out.println("Vetor aleatório com 10.000 elementos");
		System.out.println("Comparações: " + merge.getComparar());
		System.out.println("Nº de trocas: " + merge.getTrocar());
		System.out.println("Tempo gasto na operação: " + (double) (merge.getTempoFim() - merge.getTempoIni()) / (Math.pow(1000, 3))+" milissegundos\n");
	
		//executa a operação com vetor aleatório de 100.000 elementos
		vetor = new int[100000];
		rand = new Random();
		for (int i : vetor) {
			vetor[i] = rand.nextInt(vetor.length);
		}
		merge = new MergeSort();
		merge.ordena(vetor, 0, vetor.length-1);
		System.out.println("Vetor aleatório com 100.000 elementos");
		System.out.println("Comparações: " + merge.getComparar());
		System.out.println("Nº de trocas: " + merge.getTrocar());
		System.out.println("Tempo gasto na operação: " + (double) (merge.getTempoFim() - merge.getTempoIni()) / (Math.pow(1000, 3))+" milissegundos\n");
		
	}

}
