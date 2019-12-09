package TrabalhoFinal.dao;

import TrabalhoFinal.Lista.Lista;

public interface Interface<T> {

	public void adiciona(T t);
	public void remove(T t);
	public void removePorPrioridade(int prioridade);
	public T buscaPorPrioridade(int prioridade);
	public Lista<T> listaTodos(); 
}
