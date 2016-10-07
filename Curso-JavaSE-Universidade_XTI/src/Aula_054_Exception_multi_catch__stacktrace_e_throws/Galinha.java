package Aula_054_Exception_multi_catch__stacktrace_e_throws;

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
