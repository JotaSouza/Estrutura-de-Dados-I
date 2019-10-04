package Trabalhos.MetodosOrdenacao;

import java.util.Random;

public class TesteBubbleSort {

	public static void main(String[] args) {
		
		BubbleSort bubble = new BubbleSort();
		
		int[] vetor = new int[10000];
		for (int i : vetor) {
			vetor[i] = i;
		}
		long[] ordenacao = bubble.retornaComparacaoTrocaTempo(vetor);
		System.out.println("Vetor ordenado com 10.000 elementos:");
		System.out.println("Comparações: " + ordenacao[0]);
		System.out.println("Trocas: " + ordenacao[1]);
		System.out.println("Tempo: " + (double) ordenacao[2]/(Math.pow(1000, 3)) + " milisegundos.");
		System.out.println();
		
		vetor = new int[100000];
		for (int i : vetor) {
			vetor[i] = i;
		}
		ordenacao = bubble.retornaComparacaoTrocaTempo(vetor);
		System.out.println("Vetor ordenado com 100.000 elementos:");
		System.out.println("Comparações: " + ordenacao[0]);
		System.out.println("Trocas: " + ordenacao[1]);
		System.out.println("Tempo: " + (double) ordenacao[2]/(Math.pow(1000, 3)) + " milisegundos.");
		System.out.println();
		
		vetor = new int [10000];
		int j = 0;
		for (int i = vetor.length - 1; i >= 0;i--){
			vetor[j] = i;
			j++;
		}
		ordenacao = bubble.retornaComparacaoTrocaTempo(vetor);
		System.out.println("Vetor invertido com 10.000 elementos:");
		System.out.println("Comparações: " + ordenacao[0]);
		System.out.println("Trocas: " + ordenacao[1]);
		System.out.println("Tempo: " + (double) ordenacao[2]/(Math.pow(1000, 3)) + " milisegundos.");
		System.out.println();
		
		vetor = new int [100000];
		j = 0;
		for (int i = vetor.length - 1; i >= 0;i--){
			vetor[j] = i;
			j++;
		}
		ordenacao = bubble.retornaComparacaoTrocaTempo(vetor);
		System.out.println("Vetor invertido com 100.000 elementos:");
		System.out.println("Comparações: " + ordenacao[0]);
		System.out.println("Trocas: " + ordenacao[1]);
		System.out.println("Tempo: " + (double) ordenacao[2]/(Math.pow(1000, 3)) + " milisegundos.");
		System.out.println();
		
		vetor = new int [10000];
		Random rand = new Random();
		for (int i : vetor) {
			vetor[i] = rand.nextInt(vetor.length);
		}
		ordenacao = bubble.retornaComparacaoTrocaTempo(vetor);
		System.out.println("Vetor aleatório com 10.000 elementos:");
		System.out.println("Comparações: " + ordenacao[0]);
		System.out.println("Trocas: " + ordenacao[1]);
		System.out.println("Tempo: " + (double) ordenacao[2]/(Math.pow(1000, 3)) + " milisegundos.");
		System.out.println();
		
		vetor = new int [100000];
		for (int i : vetor) {
			vetor[i] = rand.nextInt(vetor.length);
		}
		ordenacao = bubble.retornaComparacaoTrocaTempo(vetor);
		System.out.println("Vetor aleatório com 100.000 elementos:");
		System.out.println("Comparações: " + ordenacao[0]);
		System.out.println("Trocas: " + ordenacao[1]);
		System.out.println("Tempo: " + (double) ordenacao[2]/(Math.pow(1000, 3)) + " milisegundos.");
		System.out.println();
	}

}
