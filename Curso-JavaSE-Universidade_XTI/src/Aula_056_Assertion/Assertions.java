package Aula_056_Assertion;

import java.util.Scanner;

/**
 *
 * @author Leonardo VAIO
 */
public class Assertions {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Entre um Numero de 0 a 10");
        int numero = s.nextInt();
        
        assert(numero >= 0 && numero<= 10): "Numero Invalido" + numero;
        System.out.println("Você entrou " + numero);
    }
    
}
