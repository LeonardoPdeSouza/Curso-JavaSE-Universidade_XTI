package Aula_043_Metodos_Sobrecarregados;

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
    
    double soma (double ... numero){ 
        double total = 0;
        for(double n : numero){
            total+= n;
        }
        return total;
    }
    double media(int x){
        System.out.print("media(int x)");
        return x;
    }
    
    double media(int x, int y){
        System.out.print("media(int x, int y)");
        return(x + y) / 2;
    }
    
    double media(double ... numeros){
        System.out.print("double ... numeros");
        return this.soma(numeros)/ numeros.length;
    
    }
    
    double media(String x, String y){
        System.out.print("media(String x, String y))");
        int ix = Integer.parseInt(x);
        int iy = Integer.parseInt(y);
        return(ix + iy) / 2;
    }
    
}

