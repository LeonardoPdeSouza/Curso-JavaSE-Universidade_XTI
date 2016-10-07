package Aula_048_Heranca_e_Construtor__super;

/**
 *
 * @author Leonardo VAIO
 */
public class AnimalTest {

    public static void main(String[] args) {
        Animal toto = new Cachorro();
        Animal carijo = new Galinha();
        
        System.out.println(toto instanceof Cachorro);
        System.out.println(toto instanceof Animal);
        
        toto.equals(toto); // compara dois objetos verificando se os valores são iguais
        toto.hashCode(); // gera um numero serial
        toto.getClass(); // retorna o tipo de classe desse objeto
        toto.toString(); // retorna a representação em String desse objeto
        
        System.out.println("Equals: "+toto.equals(toto));
        System.out.println("HashCode: "+toto.hashCode());
        System.out.println("GetClass: "+toto.getClass());
        System.out.println("ToString: "+toto.toString());
    }
    
}
