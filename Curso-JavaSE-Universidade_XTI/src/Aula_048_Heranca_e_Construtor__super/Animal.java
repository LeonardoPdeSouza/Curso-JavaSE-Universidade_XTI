package Aula_048_Heranca_e_Construtor__super;

/**
 *
 * @author Leonardo VAIO
 */
public class Animal {
    
    protected int serial; // aparece nas subclasse
//    private int serial; // não aparece nas subclasse
    double peso;
    String comida;
    
    public Animal(double peso,String comida){
        this.peso = peso;
        this.comida = comida;
    }
    
    void dormir(){System.out.println("Dormiu");}
    void fazerBarulho(){System.out.println("Fazer Barulho");}
}
