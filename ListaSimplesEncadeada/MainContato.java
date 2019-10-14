package ListaSimplesEncadeada;

import java.util.Scanner;

public class MainContato {

	public static void main(String[] args) {
		Menu();

	}
	public static void Menu() {
		Scanner input = new Scanner(System.in);
		int op;
		String nome, email;
		long telefone;
		
		do {
			System.out.println("====== Menu ======");
			System.out.println("1 - Inserir contato");
			System.out.println("2 - Listar contato");
			System.out.println("3 - Pesquisar contato");
			System.out.println("4 - Excluir contato");
			System.out.println("0 - Sair");
			op = Integer.parseInt(input.nextLine());
			
			switch (op) {
			case 1:
				System.out.print("Digite o nome do contato: ");
				nome = input.nextLine();
				System.out.print("Informe o telefone do contato: ");
				telefone = input.nextLong();
				System.out.print("Informe o email do contato: ");
				email = input.nextLine();
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
	
				break;
			case 0:
				System.out.println("Obrigado, volte sempre!");
				
				break;

			default:
				System.out.println("Opção inválida. Tente novamente!");
				break;
			}
			
		} while (op != 0);
		
		input.close();
	}

}
