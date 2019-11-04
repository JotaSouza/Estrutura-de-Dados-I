package Espalhamento;

import java.util.List;

public class TestaEspalhamento {

	public static void main(String[] args) {
		ConjuntoEspalhamento cpf = new ConjuntoEspalhamento();
		
		cpf.adiciona("00510539009");
		cpf.adiciona("00350398002");
		cpf.adiciona("10560478503");
		cpf.adiciona("99864532178");
		
		List<String> numeroCpf = cpf.pegaTodos();
		
		System.out.println("Antes de remover");
		for (String numeros : numeroCpf) {
			System.out.println(numeros);
		}
		System.out.println(" ");
		
		cpf.remove("00510539009");
		
		numeroCpf = cpf.pegaTodos();
		
		System.out.println("Depois de remover");
		for (String numeros : numeroCpf) {
			System.out.println(numeros);
		}

	}

}
