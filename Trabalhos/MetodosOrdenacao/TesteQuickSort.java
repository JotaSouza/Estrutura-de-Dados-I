package Trabalhos.MetodosOrdenacao;

import java.util.Random;

public class TesteQuickSort {

	public static void main(String[] args) {
		
		QuickSort quick = new QuickSort();
		
		//executa a opera��o com vetor ordenado de 10.000 elementos
		int[] vetor = new int[10000];
		for (int i : vetor) {
			vetor[i] = i;
		}
		quick.ordena(vetor, 0, vetor.length -1);
		System.out.println("Vetor ordenado com 10.000 elementos");
		System.out.println("Compara��es: " + quick.getComparar());
		System.out.println("N� de trocas: " + quick.getTrocar());
		System.out.println("Tempo gasto na opera��o: " + (double) (quick.getTempoFim() - quick.getTempoIni()) / (Math.pow(1000, 3))+" milissegundos\n");
		
		//executa a opera��o com vetor ordenado de 100.000 elementos
		vetor = new int[100000];
		for (int i : vetor) {
			vetor[i] = i;
		}
		quick = new QuickSort();
		quick.ordena(vetor, 0, vetor.length -1);
		System.out.println("Vetor ordenado com 100.000 elementos");
		System.out.println("Compara��es: " + quick.getComparar());
		System.out.println("N� de trocas: " + quick.getTrocar());
		System.out.println("Tempo gasto na opera��o: " + (double) (quick.getTempoFim() - quick.getTempoIni()) / (Math.pow(1000, 3))+" milissegundos\n");

		//executa a opera��o com vetor invertido de 10.000 elementos
		vetor = new int[10000];
		int j = 0;
		for (int i = vetor.length - 1; i >= 0; i--) {
			vetor[j] = i;
			j++;
		}
		quick = new QuickSort();
		quick.ordena(vetor, 0, vetor.length -1);
		System.out.println("Vetor invertido com 10.000 elementos");
		System.out.println("Compara��es: " + quick.getComparar());
		System.out.println("N� de trocas: " + quick.getTrocar());
		System.out.println("Tempo gasto na opera��o: " + (double) (quick.getTempoFim() - quick.getTempoIni()) / (Math.pow(1000, 3))+" milissegundos\n");
	
		//executa a opera��o com vetor invertido de 100.000 elementos
		vetor = new int[100000];
		j = 0;
		for (int i = vetor.length - 1; i >= 0; i--) {
			vetor[j] = i;
			j++;
		}
		quick = new QuickSort();
		quick.ordena(vetor, 0, vetor.length -1);
		System.out.println("Vetor invertido com 100.000 elementos");
		System.out.println("Compara��es: " + quick.getComparar());
		System.out.println("N� de trocas: " + quick.getTrocar());
		System.out.println("Tempo gasto na opera��o: " + (double) (quick.getTempoFim() - quick.getTempoIni()) / (Math.pow(1000, 3))+" milissegundos\n");
	
		//executa a opera��o com vetor aleat�rio de 10.000 elementos
		vetor = new int[10000];
		Random rand = new Random();
		for (int i : vetor) {
			vetor[i] = rand.nextInt(vetor.length);
		}
		quick = new QuickSort();
		quick.ordena(vetor, 0, vetor.length -1);
		System.out.println("Vetor aleat�rio com 10.000 elementos");
		System.out.println("Compara��es: " + quick.getComparar());
		System.out.println("N� de trocas: " + quick.getTrocar());
		System.out.println("Tempo gasto na opera��o: " + (double) (quick.getTempoFim() - quick.getTempoIni()) / (Math.pow(1000, 3))+" milissegundos\n");

		//executa a opera��o com vetor aleat�rio de 100.000 elementos
		vetor = new int[100000];
		rand = new Random();
		for (int i : vetor) {
			vetor[i] = rand.nextInt(vetor.length);
		}
		quick = new QuickSort();
		quick.ordena(vetor, 0, vetor.length -1);
		System.out.println("Vetor aleat�rio com 100.000 elementos");
		System.out.println("Compara��es: " + quick.getComparar());
		System.out.println("N� de trocas: " + quick.getTrocar());
		System.out.println("Tempo gasto na opera��o: " + (double) (quick.getTempoFim() - quick.getTempoIni()) / (Math.pow(1000, 3))+" milissegundos\n");
		
	}

}
