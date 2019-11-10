package TabelasHash;

public class OperacoesHash {
	
	private long chave;
	
	

	public long getChave() {
		return chave;
	}


	public void setChave(long chave) {
		this.chave = chave;
	}


	public int adiciona(long chave) {
		return (int)(chave % 200);
	}
}
