package Aula_051_Polimorfismo_Classes_final;

/**
 *
 * @author Leonardo VAIO
 */
//public final class Cachorro extends Animal{ // não pode ser herada
public class Cachorro extends Animal{

        
    @Override
//    final void fazerBarulho() { // não pode ser modificado por outra classe
    void fazerBarulho() { 
        System.out.println("Au, Au !");
    }
    
}
