package Aula_039_Modificadores_de_Acesso;

/**
 *
 * @author Leonardo VAIO
 */
@SuppressWarnings("unused")
/* Teste dentro da classe Funcionario */
public class Funcionario {

    //private String nome;
    //String nome;
    public String nome;

    public String getNome(){
            return nome;
        }
    
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.nome = "Leonardo";
        f.getNome();
        
    }

}
