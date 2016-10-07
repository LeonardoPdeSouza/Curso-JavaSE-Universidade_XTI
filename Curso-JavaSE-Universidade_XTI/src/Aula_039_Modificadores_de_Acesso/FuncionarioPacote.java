package Aula_039_Modificadores_de_Acesso;

/**
 *
 * @author Leonardo VAIO
 */

/* Teste dentro do mesmo pacote da classe Funcionario*/
public class FuncionarioPacote {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        //f.nome = "Leonardo"; privado não encontra
        //f.nome = "Leonardo"; // acessado pelo modificador "package"
        //f.nome = "Leonardo";
        f.getNome();
    }
    
}
