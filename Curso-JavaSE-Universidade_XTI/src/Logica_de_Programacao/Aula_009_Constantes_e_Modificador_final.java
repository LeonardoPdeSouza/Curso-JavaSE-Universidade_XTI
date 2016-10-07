package Logica_de_Programacao; 

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_009_Constantes_e_Modificador_final {

    public static void main(String[] args) {
        int populacaoBrasileira = 203429773;
        final double PI = 3.14159265358979323846; // nao pode ser modificado
        final char SEXO_MASCULINO = 'M';
        final char SEXO_FEMININO = 'F';
        
        // PI = 123    
        populacaoBrasileira = 123;
        
        System.out.println("PI: " + PI);
        System.out.println("População: " + populacaoBrasileira);
    }
    
}
