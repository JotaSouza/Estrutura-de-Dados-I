package TrabalhoFinal.Lista;

public class Funcionario {

	private int codigo;
	private String descricao;
	
	public Funcionario(String descricao, int codigo) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
	}
	
	public Funcionario() {}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Funcionario other = (Funcionario) obj;
		if (descricao == null) {
			if (other.descricao != null) {
				return false;
			}
		} else if (!descricao.equals(other.descricao)) {
			return false;
		}
		if(codigo == 0) {
			if(other.codigo != 0) {
				return false;
			}
		}else if (codigo == (other.codigo)) {
			return false;
		}
		return true;
	}
	
}
