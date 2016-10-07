package Logica_de_Programacao; 

import Aula_039_Modificadores_de_Acesso.Funcionario;

/**
 *
 * @author Leonardo VAIO
 */

/* Teste externo (fora do pacote da classe Funcionario)*/
public class Aula_039_FuncionarioExterno {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        //f.nome = "Leonardo"; privado não encontra
        //f.nome = "Leonardo"; // package não encontra
        f.nome = "Leonardo";
        f.getNome();
    }
    
}
