package SelectionSort.Exercicios;
import SelectionSort.Classes.Funcionarios;
import java.util.Scanner;


public class SalarioFuncionarios {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Funcionarios func1 = new Funcionarios();
        Funcionarios func2 = new Funcionarios();
        Funcionarios func3 = new Funcionarios();
        
        System.out.println("===== Cadastro e Ordena��o de Funcion�rios ====");
        System.out.println("");
        System.out.print("Informe o nome do funcion�rio: ");
        func1.setNome(input.nextLine());
        System.out.print("Informe o sal�rio do funcion�rio: ");
        func1.setSalario(input.nextFloat());
        System.out.println("");
        System.out.println("Informe o nome do funcion�rio: ");
        func2.setNome(input.nextLine());
        System.out.print("Informe o sal�rio do funcion�rio: ");
        func2.setSalario(input.nextFloat());
        System.out.println("");
        System.out.println("Informe o nome do funcion�rio: ");
        func3.setNome(input.nextLine());
        System.out.print("Informe o sal�rio do funcion�rio: ");
        func3.setSalario(input.nextFloat());
       
        
        System.out.println();
        func1.MostraDados();
        
        input.close();
    }
    
}
