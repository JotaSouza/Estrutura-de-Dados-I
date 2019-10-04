package Trabalhos.MetodosOrdenacao;

public class QuickSort {

	private long comparar = 0;
	private long trocar = 0;
	private long tempoIni = 0;
	private long tempoFim = 0;
	
	//método que faz a ordenação do vetor, comparação e verificação do tempo
	public void ordena(int[] vetor, int inicio, int fim){
		this.tempoIni = System.nanoTime();
		int meio;
		if(inicio < fim){
			meio = particao(vetor, inicio, fim);
			ordena(vetor, inicio, meio);
			ordena(vetor, meio + 1, fim);
		}
		this.tempoFim = System.nanoTime();
	}
	
	public int particao(int[] vetor, int inicio, int fim){
		int pivo = vetor[(inicio + fim) / 2];
		int i = inicio - 1;
		int j = fim + 1;
		while(i < j){
			do{
				j--;
				this.comparar++;
			}while(vetor[j] > pivo);
			do{
				i++;
				this.comparar++;
			}while(vetor[i] < pivo);
			
			if(i < j){
				int auxiliar = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = auxiliar;
				this.trocar++;
			}
		}
		return j;
	}
	
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
	
	
}
