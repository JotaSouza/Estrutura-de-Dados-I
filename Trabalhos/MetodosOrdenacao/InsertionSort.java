package MetodosOrdenacao;

public class InsertionSort {

	//método que faz a ordenação do vetor
	public int[] ordenar(int[] vetor){
		int pivo;
		int j;
		for(int i = 0; i < vetor.length; i++){
			pivo = vetor[i];
			j = i - 1 ;
			while(j > 0 && vetor[j] > pivo){
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = pivo;
		}
		return vetor;
	}
	
	//método que retorna as comparações de trocas e o tempo
	public long[] retornaComparacaoTrocaTempo(int[] vetor){
		long comparar = 0;
		long trocar = 0;
		long tempoIni = System.nanoTime();
		long tempoFim = 0;
		int pivo;
		int j;
		for(int i = 0; i < vetor.length; i++){
			pivo = vetor[i];
			trocar++;
			j = i - 1;
			comparar++;
			while(j >= 0 && vetor[j] > pivo){
				vetor[j+1] = vetor[j];
				j = j - 1;
				trocar++;
				comparar++;
			}
			vetor[j+1] = pivo;
			trocar++;
		}
		tempoFim = System.nanoTime();
		return new long[] {	comparar - 1, trocar - 2, (tempoFim - tempoIni)	};
	}
}
