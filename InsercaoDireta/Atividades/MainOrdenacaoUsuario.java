package InsercaoDireta.Atividades;

import java.util.Scanner;

public class MainOrdenacaoUsuario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcao;
		int tamanho;
		
		System.out.println(":::... Sys Ordena ...:::");
		do{		
		do{
		System.out.println("\nEscolha uma opção:"
				+ "\n[1] Ordenação por números inteiros"
				+ "\n[2] Ordenação por caracteres"
				+ "\n[0] Sair");
		System.out.print("Opção-> ");
		opcao = entrada.nextInt();
		if(opcao < 0 || opcao > 2){
			System.out.println("Opção inválida");
		}
		}while(opcao < 0 || opcao > 2);

		switch(opcao){
		case 0:
			System.out.println("Saindo do sistema . . .");
			break;
		case 1:
			System.out.print("Informe o tamanho do vetor: ");
			tamanho = entrada.nextInt();
			int[] vet = new int[tamanho];
			for(int i = 0; i < vet.length; i++) {
				System.out.print("Digite o "+(i+1)+"º número: ");
				vet[i] = entrada.nextInt();
			}
			do{
			System.out.println("\nEscolha a forma de apresentação:"
					+ "\n[1] Ordem Crescente"
					+ "\n[2] Ordem Decrescente");
			System.out.print("Opção-> ");
			opcao = entrada.nextInt();
			if(opcao == 1){
				OrdenaInsertionSort.insertionSortCrescente(vet);
				System.out.println("\nVetor ordenado em ordem crescente");
				for (int i : vet) {
					System.out.print(i+" | ");
				}
				System.out.println(" ");
			} else if(opcao == 2){
				OrdenaInsertionSort.insertionSortDecrescente(vet);
				System.out.println("\nVetor ordenado em ordem decrescente");
				for (int i : vet) {
					System.out.print(i+" | ");
				}
				System.out.println(" ");
			}else{
				System.out.println("Opção inválida!");
			}
			}while(opcao < 1 || opcao > 2);
			break;
		case 2:
			System.out.print("Informe o tamanho do vetor: ");
			tamanho = entrada.nextInt();
			String[] nome = new String[tamanho];
			for(int i = 0; i < nome.length; i++) {
				System.out.print("Digite o "+(i+1)+"º caractere: ");
				nome[i] = entrada.next();
			}
			do{
				System.out.println("\nEscolha a forma de apresentação:"
						+ "\n[1] Ordem Crescente"
						+ "\n[2] Ordem Decrescente");
				System.out.print("Opção-> ");
				opcao = entrada.nextInt();
				if(opcao == 1){
					OrdenaInsertionSort.insertionSortCrescenteString(nome);;
					System.out.println("\nVetor ordenado em ordem crescente");
					for (String i : nome) {
						System.out.print(i+" | ");
					}
					System.out.println(" ");
				} else if(opcao == 2){
					OrdenaInsertionSort.insertionSortDecrescenteString(nome);;
					System.out.println("\nVetor ordenado em ordem decrescente");
					for (String i : nome) {
						System.out.print(i+" | ");
					}
					System.out.println(" ");
				}else{
					System.out.println("Opção inválida!");
				}
				}while(opcao < 1 || opcao > 2);
			break;
			default:
				System.out.println("");
				break;
		}
		}while(opcao != 0);
		
		entrada.close();
	}

}
