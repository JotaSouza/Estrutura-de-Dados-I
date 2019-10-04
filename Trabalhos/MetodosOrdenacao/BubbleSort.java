package Trabalhos.MetodosOrdenacao;

public class BubbleSort {

	//m�todo qe faz a ordena��o do vetor
	public int[] ordenar(int[] vetor){
		final int MAX = vetor.length;
		for(int i = 0; i < MAX; i++){
			for(int j = 0; j < MAX - 1; j++){
				if(vetor[j] > vetor[j+1]){
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		return vetor;
	}
	
	//m�todo que retorna as compara��es de trocas e o tempo
	public long[] retornaComparacaoTrocaTempo(int[] vetor){
		long comparar = 0;
		long trocar = 0;
		long tempoIni = System.nanoTime();
		long tempoFim = 0;
		final int MAX = vetor.length;
		for(int i = 0; i < MAX; i++){
			for(int j = 0; j < MAX - 1; j++){
				comparar++;
				if(vetor[j] > vetor[j+1]){
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
					trocar++;
			}
		}
	}
		tempoFim = System.nanoTime();
		return new long[] {	comparar, trocar, (tempoFim - tempoIni)	};
  }
}