
package Aula_038_Desafio_Raiz_Quadra_com_Equacao_Pell;

/**
 *
 * @author Leonardo VAIO
 */
public class Matematica {
    
    int teste = 1;
    int contador = 1; // inicializado com 1 por causa da variavel resultado fora do while
    /**
     * 
     * @param um
     * @param dois
     * @return o maior entre os numero
     */
    int maior(int um, int dois){
        if(um > dois){
            return um;
        }else{
            return dois;
        }
    }
    int raiz(int numero){
        int resultado = numero - teste;
        System.out.println(numero + " - " + teste + " = " + resultado);
        
        while (resultado >= teste) {
            ++contador;
            teste = teste + 2;
            int resultado2 = resultado;
            resultado = resultado - teste;
            System.out.println(resultado2 + " - " + teste + " = " + resultado);
            
        }
        System.out.println("Raiz do " + numero + " é " + contador +" sobrando " + resultado);
        return numero;
        
    }
    
    String romanos(int numero){
        return "XXX";
    }
    
    double soma(){
        return 0;
    }
    
    int raiz2(int numero){
        int raiz = 0, impar = 1;
        while(numero >= impar){
            numero -= impar;
            impar += 2; // proximo número impar
            ++raiz;
        }
        return raiz;
    }
}
