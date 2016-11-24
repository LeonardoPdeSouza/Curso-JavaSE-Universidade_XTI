package Aula_068_Serializacao_de_Contas;

import java.io.Serializable;

/**
 *
 * @author Leonardo VAIO
 */
public class Conta implements Serializable{
    private String cliente;
    private double saldo;

    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    
    void exibeSaldo(){
        System.out.println(cliente + " seu saldo é: " + saldo);
    }
    
    void saca(double valor){
        saldo -= valor;
    }
    void deposita(double valor){
        saldo += valor;
    }
    void transferePara(Conta destino, double valor){
        this.saca(valor);
        destino.deposita(valor);
    }
    @Override
    public String toString() {
        return " Cliente: " + cliente + " Tem saldo de" + saldo;
    }
    
}
