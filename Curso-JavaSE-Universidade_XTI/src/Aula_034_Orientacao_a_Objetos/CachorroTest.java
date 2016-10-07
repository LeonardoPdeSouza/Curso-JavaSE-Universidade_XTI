package Aula_034_Orientacao_a_Objetos;

/**
 *
 * @author Leonardo VAIO
 */
public class CachorroTest {

    public static void main(String[] args) {
        Cachorro pitbull = new Cachorro();
        pitbull.raca = "Pit Bull";
        pitbull.tamanho = 40;
        pitbull.latir();
        
        Cachorro viralata = new Cachorro();
        pitbull.raca = "Vira-Lata";
        pitbull.tamanho = 30;
        pitbull.latir();
    }
    
}
