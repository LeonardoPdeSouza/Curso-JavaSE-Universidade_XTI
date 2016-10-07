package Aula_040_Metodos_get_e_set_Encapsulamento;

/**
 *
 * @author Leonardo VAIO
 */
public class FuncionarioPacote {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        String n = f.getNome();
        f.setNome("Leonardo");
    }
    
}
