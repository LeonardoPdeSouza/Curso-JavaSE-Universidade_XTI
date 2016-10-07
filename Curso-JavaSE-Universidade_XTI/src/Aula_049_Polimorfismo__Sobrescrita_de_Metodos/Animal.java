package Aula_049_Polimorfismo__Sobrescrita_de_Metodos;


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
