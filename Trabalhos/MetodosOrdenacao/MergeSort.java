package MetodosOrdenacao;

public class MergeSort {

	private long comparar = 0;
	private long trocar = 0;
	private long tempoIni = 0;
	private long tempoFim = 0;
	
	
	
	public long getComparar() {
		return comparar;
	}

	public void setComparar(long comparar) {
		this.comparar = comparar;
	}

	public long getTrocar() {
		return trocar;
	}

	public void setTrocar(long trocar) {
		this.trocar = trocar;
	}

	public long getTempoIni() {
		return tempoIni;
	}

	public void setTempoIni(long tempoIni) {
		this.tempoIni = tempoIni;
	}

	public long getTempoFim() {
		return tempoFim;
	}

	public void setTempoFim(long tempoFim) {
		this.tempoFim = tempoFim;
	}

	//método que faz a ordenação do vetor, comparação e verificação do tempo
	public void ordena(int[] vetor, int inicio, int fim){
		if(tempoIni == 0){
			this.tempoIni = System.nanoTime();
		}
		int meio;
		if(inicio < fim){
			meio = (inicio + fim) / 2;
			ordena(vetor, inicio, meio);
			ordena(vetor, meio + 1, fim);
			intercala(vetor, inicio, meio, fim);
		}
		this.tempoFim = System.nanoTime();
	}
	
	public void intercala(int[] vetor, int inicio, int meio, int fim){
		int auxiliar[] = new int[vetor.length];
		
		for(int i = inicio; i <= meio; i++){
			auxiliar[i] = vetor[i];
		} 
		
		for(int j = meio + 1; j <= fim; j++){
			auxiliar[fim+meio+1-j] = vetor[j];
		}
		
		int i = inicio;
		int j = fim;
		for(int k = inicio; k <= fim; k++){
			this.trocar++;
			this.comparar++;
			if(auxiliar[i] <= auxiliar[j]){
				vetor[k] = auxiliar[i];
				i++;
			} else{
				vetor[k] = auxiliar[j];
				j--;
			}
		} 
	}
}