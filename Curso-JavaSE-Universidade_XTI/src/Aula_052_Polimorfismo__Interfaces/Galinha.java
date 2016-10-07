package Aula_052_Polimorfismo__Interfaces;

/**
 *
 * @author Leonardo VAIO
 */
public class Galinha extends Animal implements AreaCalculavel{

    @Override
    void fazerBarulho() {
        System.out.println("Có, Có !");
    }

    @Override
    public double calculaArea() {
        return 0;
    }
   
}
