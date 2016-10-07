package Aula_052_Polimorfismo__Interfaces;

/**
 *
 * @author Leonardo VAIO
 */
public class Cubo implements VolumeCalculavel, AreaCalculavel{

    double lado;
    
    public Cubo(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calculaVolume() {
        return 6 * lado * lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado * lado;
    }
    
}
