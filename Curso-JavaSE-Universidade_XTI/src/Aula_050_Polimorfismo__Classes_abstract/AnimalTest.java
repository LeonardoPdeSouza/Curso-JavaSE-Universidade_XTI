package Aula_050_Polimorfismo__Classes_abstract;

/**
 *
 * @author Leonardo VAIO
 */
public class AnimalTest {

    public static void barulho(Animal animal){
        animal.fazerBarulho();
    }
    public static void main(String[] args) {
        //Animal animal = new Animal;
        Animal cachorro = new Cachorro();
        Animal galinha = new Galinha();
        Cachorro toto = new Cachorro();
        
    }
    
}
