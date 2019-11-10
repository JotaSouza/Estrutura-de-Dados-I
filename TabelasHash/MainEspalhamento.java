package TabelasHash;

import java.util.List;

public class MainEspalhamento {

	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		
		Espalhamento espelhamento = new Espalhamento();
		
		for (int i = 0; i < 50000; i++) {
		      espelhamento.adiciona("palavra" + i);
		}
		
		for (int i = 0; i < 50000; i++) {
		      espelhamento.contem("palavra" + i);
		}
		
		long fim = System.currentTimeMillis(); 
	    System.out.println("Tempo: " + (fim - inicio) / 1000.0);
	
	
		espelhamento.adiciona("Pedro");
		espelhamento.adiciona("Fabio");
		espelhamento.adiciona("Juca");
		espelhamento.adiciona("Jaque");
		espelhamento.adiciona("Tefa");
		
		List<Object> objetos = espelhamento.pegaTodas();
		
		for (Object objeto : objetos) {
			System.out.println(objeto);
		}
		
		espelhamento.remove("Juca");
		objetos = espelhamento.pegaTodas();
		
		System.out.println(" ");
		for (Object objeto : objetos) {
			System.out.println(objeto);
		}
		
		System.out.println(espelhamento.contem("Jaque"));
		System.out.println(espelhamento.tamanho());
		
		espelhamento.adiciona("Jaque");
		System.out.println(espelhamento.tamanho());
		
		System.out.println("");
		Espalhamento espelhamento2 = new Espalhamento();
		
		for(int i = 0; i < 100; i++) {
			espelhamento2.adiciona("" + i);
		}
		
		espelhamento2.imprimeTabela();
		
	}

}
