package Aula_037_Metodos_com_Retorno;

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
    
    double soma (double um, double dois){
        double s = um + dois;
        return s;
    }
}
