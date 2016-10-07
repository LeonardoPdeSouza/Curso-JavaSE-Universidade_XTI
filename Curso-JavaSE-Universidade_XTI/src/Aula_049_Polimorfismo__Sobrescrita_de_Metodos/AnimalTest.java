package Aula_049_Polimorfismo__Sobrescrita_de_Metodos;

/**
 *
 * @author Leonardo VAIO
 */
public class AnimalTest {

    public static void barulho(Animal animal){
        animal.fazerBarulho();
    }
    
    public static void barulhoSemPolimorfismo(String animal){
        if(animal.equals("Cachorro")){
            System.out.println("Au, Au !");
        }else if(animal.equals("Galinha")){
            System.out.println("Có, Có !");
        }
    }
    public static void main(String[] args) {
//        Animal generico = new Animal(0, null);
        Animal toto = new Cachorro();
        Animal carijo = new Galinha();
        
        barulho(toto);
        barulho(carijo);
        System.out.println("================");
        barulhoSemPolimorfismo("Cachorro");
        barulhoSemPolimorfismo("Galinha");
//        generico.fazerBarulho();
//        toto.fazerBarulho();
//        carijo.fazerBarulho();
    }
    
}
