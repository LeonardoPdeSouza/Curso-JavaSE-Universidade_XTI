package Aula_050_Polimorfismo__Classes_abstract;


/**
 *
 * @author Leonardo VAIO
 */
public abstract class Animal {
   
    double peso;
    String comida;
    
    void dormir(){
        System.out.println("Dormiu");
    }
    
    abstract void fazerBarulho();
}
