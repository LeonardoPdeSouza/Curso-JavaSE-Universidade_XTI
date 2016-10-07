package Aula_049_Polimorfismo__Sobrescrita_de_Metodos;

/**
 *
 * @author Leonardo VAIO
 */
public class Galinha extends Animal{
    public Galinha(){
        super(2, "Milho");
    }
    void fazerBarulho(){
        System.out.println("Có, Có !");
    }
}
