package TabelasHash;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Espalhamento<T> {
	
	private List<List<T>> tabela =  new ArrayList<List<T>>();
	private int tamanho = 0;
	
	public Espalhamento() {
		for(int i = 0; i < 26; i ++) {
			LinkedList<T> lista = new LinkedList<T>();
			tabela.add(lista);
		}
	}
		
	/*@SuppressWarnings("unused")
	private int calculaCodigoDeEspalhamento(String palavra) {
		int cod = 1;
		for(int i = 0; i < palavra.length(); i++) {
			cod = 31 * cod + palavra.charAt(i);
		}
		return cod;
	}*/
	
	@SuppressWarnings("unused")
	private int calculaIndiceTabela(T objeto) {
		int codigoDeEspalhamento = objeto.hashCode();
		codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
		return codigoDeEspalhamento % this.tabela.size();
	}

	public void adiciona(T objeto) {
		if(!this.contem(objeto)) {
			this.verificaCarga();
			int indice  = this.calculaIndiceTabela(objeto);
			List<T> lista = this.tabela.get(indice);
			lista.add(objeto);
			this.tamanho++;
		}
	}
	
	public void remove(T objeto) {
	    if(this.contem(objeto)) {
	    	int indice = this.calculaIndiceTabela(objeto);
	    	List<T> lista = this.tabela.get(indice);
			lista.remove(objeto);
			this.tamanho--;
			this.verificaCarga();
	    }
	}
	
	public boolean contem(T objeto) {
		int indice = this.calculaIndiceTabela(objeto);
		List<T> lista = this.tabela.get(indice);
		return lista.contains(objeto);
	 }
	  
	public List<T> pegaTodas(){
		List<T> objetos = new ArrayList<T>();
		for(int i = 0; i < this.tabela.size(); i++) {
			objetos.addAll(this.tabela.get(i));
		}
 		return objetos;
	 }
	
	public void imprimeTabela() {
		for(List<T> lista: this.tabela) {
			System.out.println("[");
			for(int i = 0; i < lista.size(); i++) {
				System.out.println("*");
			}
			System.out.println("]");
		}
	}
	
	public void redimensionaTabela(int novaCapacidade) {
		List<T> objetos = this.pegaTodas();
		this.tabela.clear();
		
		for(int i = 0; i < novaCapacidade; i++) {
			this.tabela.add(new LinkedList<T>());
		}
		
		for (T objeto : objetos) {
			this.adiciona(objeto);
		}
	}
	
	public void verificaCarga() {
		int capacidade = this.tabela.size();
		double carga = (double) this.tamanho / capacidade;
		if(carga > 0.75) {
			this.redimensionaTabela(capacidade * 2);
		} else if (carga < 0.25) {
			this.redimensionaTabela(Math.max(capacidade / 2, 10));
		}
	}
	  
	public int tamanho() {
		return this.tamanho;
	}  
}
