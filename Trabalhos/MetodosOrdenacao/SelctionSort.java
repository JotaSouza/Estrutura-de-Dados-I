package Trabalhos.MetodosOrdenacao;

public class SelctionSort {

	//método que faz a ordenação do vetor
	public int[] ordenar(int[] vetor){
		final int MAX = vetor.length;
		for(int i = 0; i < MAX - 1; i++){
			int MIN = i;
			for(int j = MIN + 1; j < MAX; j++){
				if(vetor[j] < vetor[MIN]){
					MIN = j;
				}
			}
			int aux = vetor[i];
			vetor[i] = vetor[MIN];
			vetor[MIN] = aux;
			
		}
		return vetor;
	}
	
	//método que retorna as comparações de trocas e o tempo
		public long[] retornaComparacaoTrocaTempo(int[] vetor){
			long comparar = 0;
			long trocar = 0;
			long tempoIni = System.nanoTime();
			long tempoFim = 0;
			final int MAX = vetor.length;
			for(int i = 0; i < MAX - 1; i++){
				int MIN = i;
				for(int j = MIN + 1; j < MAX; j++){
					comparar++;
					if(vetor[j] < vetor[MIN]){
						MIN = j;
					}
				}
				int aux = vetor[i];
				if(i != MIN){
					trocar++;
				}
				vetor[i] = vetor[MIN];
				trocar++;
				vetor[MIN] = aux;
			}
			tempoFim = System.nanoTime();
			return new long[] {	comparar, trocar, (tempoFim - tempoIni)	};
		}
}
