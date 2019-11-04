package ListaEncadeada;

import java.util.Scanner;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada contato = new ListaEncadeada();
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		String email;
		long telefone;
		
		System.out.print("Informe o nome: ");
		nome = entrada.nextLine();
		System.out.print("Informe o e-mail: ");
		email = entrada.nextLine();
		System.out.print("Informe o telefone: ");
		telefone = entrada.nextLong();
		
		contato.inserirLista(nome, email, telefone);
		
		contato.imprimirLista();
		entrada.nextLine();
		System.out.print("Informe o nome do contato: ");
		nome = entrada.nextLine();
		contato.consultaLista();
		System.out.println("Contato consultado: ");
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Telefone: " + telefone);
		

	}

}
