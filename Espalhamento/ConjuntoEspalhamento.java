package Espalhamento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
	
	private List<List<String>> tabela = new ArrayList<List<String>>();
	private int tamanho = 0;
	
	public ConjuntoEspalhamento() {
		for(int i = 0; i < 200; i++) {
			LinkedList<String> lista = new LinkedList<String>();
			tabela.add(lista);
		}
	}
	
	public int calculaIndiceDaTabela(String numeroCpf) {
		return (int)numeroCpf.toLowerCase().charAt(0) % 200;
	}
	
	public void adiciona(String numeroCpf) {
		if(!this.contem(numeroCpf)) {
			int indice = this.calculaIndiceDaTabela(numeroCpf);
			List<String> lista = this.tabela.get(indice);
			lista.add(numeroCpf);
			this.tamanho++;
		}
		
	}
	
	public void remove(String numeroCpf) {
		if(this.contem(numeroCpf)) {
			int indice = this.calculaIndiceDaTabela(numeroCpf);
			List<String> lista = this.tabela.get(indice);
			lista.remove(numeroCpf);
			this.tamanho--;
		}
	}
	
	public boolean contem(String numeroCpf) {
		int indice = this.calculaIndiceDaTabela(numeroCpf);
		List<String> lista = this.tabela.get(indice);
		return lista.contains(numeroCpf);
	}
	
	public List<String> pegaTodos(){
		List<String> numeroCpf = new ArrayList<String>();
		for(int i = 0; i < this.tabela.size(); i++) {
			numeroCpf.addAll(this.tabela.get(i));
		}
		return numeroCpf;
		
	}
	
	public int tamanho() {
		return this.tamanho;
		
	}
		
}
	

