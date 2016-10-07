package Aula_049_Polimorfismo__Sobrescrita_de_Metodos;

/**
 *
 * @author Leonardo VAIO
 */
public class OperacaoTest {

    public static void calcule(OperacaoMatematica o, double x, double y){
        System.out.println(o.calcular(x, y));
    }
    
    public static void calculeSemPolimordismo(String o, double x, double y){
        if(o.equals("Soma")){
            System.out.println(x+y);
        } else if(o.equals("Multiplicacao")){
            System.out.println(x*y);
        }
    }
    
    public static void main(String[] args) {
        calcule(new Soma(), 5, 5);
        calcule(new Multiplicacao(), 5, 5);
    }
    
}
