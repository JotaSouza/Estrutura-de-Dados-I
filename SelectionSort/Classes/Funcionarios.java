package SelectionSort.Classes;

public class Funcionarios {
    protected String nome;
    protected float salario;
    
    public Funcionarios(){
    
    }
    
    public void MostraDados(){
        System.out.println("Nomes: "+ getNome());
    }
    
    public Funcionarios(String _nome, float _salario){
        nome = _nome;
        salario = _salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float _salario) {
        this.salario = _salario;
    }
    
}
