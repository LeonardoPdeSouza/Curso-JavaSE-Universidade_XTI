package Aula_042_VarArgs_Argumentos_Variaveis;

/**
 *
 * @author Leonardo VAIO
 */
public class Matematica {
        /**
     * 
     * @param um
     * @param dois
     * @return maior dos dois numeros
     */
    int maior(int um, int dois){
        if(um > dois){
            return um;
        }else{
            return dois;
        }
    }
    
    double soma (String titulo, double ... numero){  // double soma (double[] numero){
        System.out.print(titulo);
        double total = 0;
        for(double n : numero){
            total+= n;
        }
        return total;
    }
}

