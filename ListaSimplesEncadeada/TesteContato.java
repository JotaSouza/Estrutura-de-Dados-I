package ListaSimplesEncadeada;

public class TesteContato {

	public static void main(String[] args) {
		ContatoLista jota = new ContatoLista();
		jota.setNome("Jonatas Souza");
		jota.setEmail("jotabccif@gmail.com");
		jota.setTelefone(992034055);
		
		ContatoLista paulo = new ContatoLista();
		paulo.setNome("Paulo Santos");
		paulo.setEmail("paulosantos@yahoo.com.br");
		paulo.setTelefone(33144327);
		
		ContatoLista fabio = new ContatoLista();
		fabio.setNome("Fabio Victor");
		paulo.setEmail("fabinho@yahoo.com.br");
		paulo.setTelefone(33144789);
		
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.adiciona(jota);
		lista.adiciona(paulo);
		lista.adiciona(0, fabio);
		
		System.out.println(lista.tamanho());
		
		System.out.println(lista.contem(fabio));
		
		
	}

}
