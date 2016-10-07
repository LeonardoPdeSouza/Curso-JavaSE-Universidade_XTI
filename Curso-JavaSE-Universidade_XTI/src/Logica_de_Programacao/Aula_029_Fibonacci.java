/*
DESAFIO : Fibonacii
começa-se a série com 0 (zero) e 1(um)
obtém-se o próximo número de Fibonacci
somando-se os dois anteriores e, assim,
sucessiva e infinitamente.

EX: 1+2 = 3    2+3 = 4  3+5= 8 5+8 = 13
 */

package Logica_de_Programacao; 

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_029_Fibonacci {

    public static void main(String[] args) {
      int anterior = 0;
      int proximo = 1;
      int resultado = anterior + proximo;
        System.out.println(anterior + " + " + proximo + " = " + resultado);
        while(resultado < 50){
            anterior = proximo;
            proximo = resultado;
            resultado = anterior + proximo;
            System.out.println(anterior + " + " + proximo + " = " + resultado);
            
            
            
            
            
            
        }
        
    }
    
}
