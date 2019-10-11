package Listas.ListaSimples;

public class TestaLista {

	public static void main(String[] args) {
		OperacoesListas op = new OperacoesListas();
		//insere as informações no inicio da lista
		for (int i = 1; i<10; i++){
			op.inserirInicio(i*3);
		}
		op.mostraLista();
		
		OperacoesListas op1 = new OperacoesListas();
		//insere as informações no inicio da lista
		for (int i = 1; i<10; i++){
			op1.inserirNoFim(i*3);
		}
		System.out.println("");
		op1.mostraLista();

		op.removerNodo(3);
		op.mostraLista();
		
		if (op.contarNodos()!=0){
			System.out.println("Total de nodos: "+op.contarNodos());
		} else {
			System.out.println("Lista Vazia!");
		}
		
		System.out.println("Altura a partir do terceiro = "+op.calculaAltura(3));
	}
	
}
