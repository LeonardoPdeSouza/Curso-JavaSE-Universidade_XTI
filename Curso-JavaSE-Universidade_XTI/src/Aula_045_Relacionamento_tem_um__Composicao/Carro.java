package Aula_045_Relacionamento_tem_um__Composicao;

/**
 *
 * @author Leonardo VAIO
 */
public class Carro {

    String modelo;
    int velocidadeMaxima;
    double segundosZeroACem;
    Motor motor;

    public Carro() {

    }

    public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
        this(modelo,velocidadeMaxima,segundosZeroACem, null);
    }
    public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
        this.motor = motor;
    }
    
}
