package TrabalhoFinal;

import java.util.Scanner;
import TrabalhoFinal.Fila.FilaComPrioridade;
import TrabalhoFinal.Fila.Processo;
import TrabalhoFinal.Lista.Funcionario;
import TrabalhoFinal.Lista.Lista;
import TrabalhoFinal.Lista.Mesa;
import TrabalhoFinal.Pilha.Pilha;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * criando a lista de funcionarios
		 */
		Lista<Funcionario> listaFuncionarios = new Lista<>();
		/*
		 * criando os objetos funcionario
		 */
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		Funcionario funcionario4 = new Funcionario();
		Funcionario funcionario5 = new Funcionario();
		Funcionario funcionario6 = new Funcionario();		
		/*
		 * setando os dados do funcionario
		 */
		funcionario1.setDescricao("Funcionario 1");
		funcionario2.setDescricao("Funcionario 2");
		funcionario3.setDescricao("Funcionario 3");
		funcionario4.setDescricao("Funcionario 4");
		funcionario5.setDescricao("Funcionario 5");
		funcionario6.setDescricao("Funcionario 6");		
		/*
		 * adicionando na lista de funcionarios
		 */
		listaFuncionarios.adiciona(funcionario1);
		listaFuncionarios.adiciona(funcionario2);
		listaFuncionarios.adiciona(funcionario3);
		listaFuncionarios.adiciona(funcionario4);
		listaFuncionarios.adiciona(funcionario5);
		listaFuncionarios.adiciona(funcionario6);		
		/*
		 * criando a lista de mesas
		 */
		Lista<Mesa> listaMesas = new Lista<>();
		/*
		 * criando os objetos mesa
		 */
		Mesa mesa1 = new Mesa();
		Mesa mesa2 = new Mesa();
		Mesa mesa3 = new Mesa();
		Mesa mesa4 = new Mesa();
		/*
		 * setando os dados das mesas
		 */
		mesa1.setDescricao("Mesa 1");
		mesa2.setDescricao("Mesa 2");
		mesa3.setDescricao("Mesa 3");
		mesa4.setDescricao("Mesa 4");
		/*
		 * adicionando na lista de mesas
		 */
		listaMesas.adiciona(mesa1);
		listaMesas.adiciona(mesa2);
		listaMesas.adiciona(mesa3);
		listaMesas.adiciona(mesa4);
		
			
		Processo p = null;
		FilaComPrioridade<Processo> filaP = new FilaComPrioridade<>();
		Pilha<Processo> urgente = new Pilha<Processo>();
		Pilha<Processo> poucoUrgente = new Pilha<Processo>();
		Pilha<Processo> naoUrgente = new Pilha<Processo>();

		
		int op = 0;
		
		while(op != 4) {
			System.out.println("        ...::: SysOffice :::...\n ");
			System.out.println("Informe o n�mero da op��o ao programa\n"
					+ "Op��o 1: Receber novo processo\n"
					+ "Op��o 2: Realizar triagem de processos recebidos\n"
					+ "Op��o 3: Analisar um processo\n"
					+ "Op��o 4: Sair");
			System.out.print("Op��o-> ");
			op = entrada.nextInt();
			entrada.nextLine();
			
			switch (op) {
				case 1:
					p = new Processo();
					System.out.print("\nInforme o nome do processo: ");
					p.setNome(entrada.nextLine());
					System.out.println("Prioridade: \n1: Urgente \n2: Pouco urgente \n3: N�o urgente");
					int finalidade = 0;
					System.out.print("Op��o-> ");
					finalidade = entrada.nextInt();
					p.setPrioridade(finalidade);
					entrada.nextLine();
					filaP.enfileira(p);
					break;
				case 2:
					if(filaP.estaVazia() == true) {
						System.out.println("Triagem de processos j� foi realizada!");
					}else {
						while(!filaP.estaVazia()) {
							p = filaP.espiar();
							if(p.getPrioridade() == 1) {
								urgente.empilha(filaP.desenfileira());
							}else if(p.getPrioridade() ==2) {
								poucoUrgente.empilha(filaP.desenfileira());
							}else {
								naoUrgente.empilha(filaP.desenfileira());
							}
						}
						System.out.println("Triagem realizada com sucesso!");
					}
					break;
				case 3:
					//verifica se a fila nao esta vazia e se j� foi realizada a triagem
					if(!filaP.estaVazia() && urgente.estaVazia() == true && poucoUrgente.estaVazia() == true && naoUrgente.estaVazia() == true){
						System.out.println("Triagem de processos n�o realizada!\n"
						+ "Por favor, realize a triagem de processos para continuar.");	
					}else if(filaP.estaVazia() == true && urgente.estaVazia() == true && poucoUrgente.estaVazia() == true && naoUrgente.estaVazia() == true){
						System.out.println("N�o h� os processos a serem analisados.");
					}else{
						int cont = 0;
						do{
							for(int i = 0; i <= urgente.tamanho(); i++) {
								for(int j = 0; j <= listaMesas.tamanho(); j++) {
									if( cont == listaMesas.tamanho()) {
										System.out.println("Todas as mesas est�o ocupadas!");
										continue;
									}else {
										urgente.desempilha();
									}
									System.out.println("Passou "+ (cont + 1) + "vez");
									cont++;
								}
							}
						}while(!urgente.estaVazia());
					}
					
					break;
				case 4:
					break;
	
				default:
					System.out.println("Op��o inv�lida! Escolha uma op��o v�lida para continuar.");
					break;
			}
						
		}
		
		entrada.close();

	}

}
