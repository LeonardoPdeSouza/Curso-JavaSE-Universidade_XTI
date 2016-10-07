package Aula_047_Heranca;

/**
 *
 * @author Leonardo VAIO
 */
public class AnimalTest {

    public static void main(String[] args) {
        Cachorro toto = new Cachorro();
        toto.comida = "Carne";
        toto.dormir();
        
        Galinha carijo = new Galinha();
        carijo.dormir();
    }
    
}
