package Aula_040_Metodos_get_e_set_Encapsulamento;

/**
 *
 * @author Leonardo VAIO
 */
public class Funcionario {
private String nome;
private boolean ativo;

public String getNome(){
    return nome;
}
public void setNome(String n){
    this.nome = n;
}
public boolean isAtivo(){
    return ativo;
}

public void setAtivo(boolean ativo){
    this.ativo = ativo;
}
}
