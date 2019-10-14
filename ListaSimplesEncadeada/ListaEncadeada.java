package ListaSimplesEncadeada;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private int totalElementos;
	
	public void adicionaNoComeco(Object elemento) {
		Celula novo = new Celula(this.primeiro, elemento);
		this.primeiro = novo;
		
		
		if(this.totalElementos == 0) {
			//caso a lista esteja vazia
			this.ultimo = this.primeiro;
		}
		this.totalElementos++;
	}
	
	public void adiciona(Object elemento) {
		if(this.totalElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula novo = new Celula(elemento);
			this.ultimo.setProxima(novo);
			this.ultimo = novo;
			this.totalElementos++;
		}
		
	}
	
	public void adiciona(int posicao, Object elemento) {
		if(posicao == 0) {//adiciona no começo da lista
			this.adicionaNoComeco(elemento);
		} else if (posicao == this.totalElementos) {// adiciona no fim da lista
			this.adiciona(elemento);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula nova = new Celula(anterior.getProxima(), elemento);
			anterior.setProxima(nova);
			this.totalElementos++;
		}
		
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao <  this.totalElementos;
	}
	
	private Celula pegaCelula(int posicao) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		Celula atual = primeiro;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		return atual;
	}
	
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}
	
	public void remove(int posicao) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não existe na lista!");
		}
		
		if(posicao == 0) {
			this.removeDoComeco();
		} else if(posicao == this.totalElementos -1) {
			this.removeDoFim();
		} else {
			Celula anterior = this.pegaCelula(posicao -1);
			Celula atual = anterior.getProxima();
			Celula proximo = atual.getProxima();
			
			anterior.setProxima(proximo);
			proximo.setAnterior(anterior);
			
			this.totalElementos--;
		}
		
	}
	
	public int tamanho() {
		return this.totalElementos;
	}
	
	public boolean contem(Object elemento) {
		Celula atual = this.primeiro;
		
		while(atual != null) {
			if(atual.getElemento().equals(elemento)) {
				return true;
			}
			atual = atual.getProxima();
		}
		return false;
	}
	
	public void removeDoComeco() {
		if(!this.posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posição não existe na lista!");
		}
		
		this.primeiro = this.primeiro.getProxima();
		this.totalElementos--;
		
		if(this.totalElementos == 0) {
			this.ultimo = null;
		}
	}
	
	public void removeDoFim() {
		if(!this.posicaoOcupada(this.totalElementos -1)) {
			throw new IllegalArgumentException("Posição não existe na lista!");
		}
		if(this.totalElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultimo.getAnterior();
			penultima.setProxima(null);
			this.ultimo = penultima;
			this.totalElementos--;
		}
		
	}
	
	public String toString() {
		//Verificando lista vazia
		if(this.totalElementos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeiro;
		
		//Percorre até o ultimo elemento
		for(int i = 0; i < this.totalElementos - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		
		//último elemento
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}
	
}

