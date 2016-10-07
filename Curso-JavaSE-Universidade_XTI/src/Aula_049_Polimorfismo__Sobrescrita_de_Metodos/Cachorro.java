package Aula_049_Polimorfismo__Sobrescrita_de_Metodos;

/**
 *
 * @author Leonardo VAIO
 */
public class Cachorro extends Animal{
    
    double peso; 
    
    public Cachorro(){
        super(30, "Carne");
    }
    void fazerBarulho(){
        System.out.println("Au, Au !");
    }
}
