package Aula_044_Construtores;

/**
 *
 * @author Leonardo VAIO
 */
public class Carro {
    String modelo;
    int velocidadeMaxima;
    double segundosZeroACem;
    
    public Carro(){
        
    }
    
    public Carro(String modelo,int velocidadeMaxima,double segundosZeroACem){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
    }
}
