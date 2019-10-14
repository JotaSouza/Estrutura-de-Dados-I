package ListaSimplesEncadeada;

public class Vetor {

	private Object[] objetos = new Object[10];
	
	private int totalDeObjetos = 0;

	
	
	public void adiciona(Object objeto) {
		this.garantaEspaco();
		this.objetos[this.totalDeObjetos] = objeto;
		this.totalDeObjetos++;
	}
	
	public void adiciona(int posicao, ContatoLista contato) {
		this.garantaEspaco();
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		
		for(int i = this.totalDeObjetos -1; i >= posicao; i--) {
			this.objetos[i + 1] = this.objetos[i];
		}
		
		this.objetos[posicao] = contato;
		this.totalDeObjetos++;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalDeObjetos;
	}
	
	public Object pega(int posicao) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		return this.objetos[posicao];
    }
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeObjetos;
	}
	
	public void remove(int posicao) {
		if(!this.removePosicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		
		for(int i = posicao; i < this.totalDeObjetos -1; i++) {
			this.objetos[i] = this.objetos[i + 1];
		}
		this.totalDeObjetos--;
	}
	
	private boolean removePosicaoOcupada(int posicao) {
		return posicao < this.objetos.length && posicao >=0;
	}
	
	public boolean contem(ContatoLista contato) {
		for(int i = 0; i < this.totalDeObjetos; i++) {
			if(contato.equals(this.objetos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		return this.totalDeObjetos;
	}
	
	private void garantaEspaco() {
		if(this.totalDeObjetos == this.objetos.length) {
			Object[]  novoArray = new Object[this.objetos.length * 2];
			for(int i = 0; i < this.objetos.length; i++) {
				novoArray[i] = this.objetos[i];
			}
			this.objetos = novoArray;
		}
	}
	
	public String toString() {
		if(this.totalDeObjetos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for(int i = 0; i < this.totalDeObjetos - 1; i++) {
			builder.append(this.objetos[i]);
			builder.append(",");
		}
		
		builder.append(this.objetos[this.totalDeObjetos - 1]);
		builder.append("]");
		
		return builder.toString();
	}
	
	
}
