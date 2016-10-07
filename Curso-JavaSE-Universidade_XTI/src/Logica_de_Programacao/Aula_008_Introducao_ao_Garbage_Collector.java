package Logica_de_Programacao; 

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_008_Introducao_ao_Garbage_Collector {

    public static void main(String[] args) {
        // Variavel Primitiva
        int x = 7;
        x = 9;
        
        // Variavel de Referencia
        String y = "XTI";
        y = "xti.com.br";
        y = null;
        System.out.println("Valor do Y: " + y);
    }
    
}
