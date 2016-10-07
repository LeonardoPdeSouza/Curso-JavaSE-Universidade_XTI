package Aula_064_Desafio_IO_Armazenar_Contas_em_Arquivo_Sequencial;

/**
 *
 * @author Leonardo VAIO
 */
public class ContaManeira2 {
    private String cliente;
    private double saldo;

    public ContaManeira2(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    
    public void exibeSaldo(){
        System.out.println(cliente + " seu saldo é: " + saldo);
    }
    
    public void saca(double valor){
        saldo -= valor;
    }
    public void deposita(double valor){
        saldo += valor;
    }
    public void transferePara(Conta destino, double valor){
        this.saca(valor);
        destino.deposita(valor);
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
}
