package Aula_067_Serialização_transient;

import java.io.Serializable;

public class Conta implements Serializable {

	// static String statico; // variáveis estaticas não são serializadas
    String cliente;
    transient double saldo; // Não é serializado

    public Conta() {

    }

    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void exibeSaldo() {
        System.out.println("[ " + cliente + " ] O saldo é: " + saldo);
    }

    public void saca(double valor) {
        saldo -= valor;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public void transferePara(Conta destino, double valor) {
        saldo -= valor;
        destino.saldo += valor;
    }

}