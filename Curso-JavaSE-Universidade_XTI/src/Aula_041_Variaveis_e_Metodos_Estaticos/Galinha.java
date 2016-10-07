package Aula_041_Variaveis_e_Metodos_Estaticos;

/**
 *
 * @author Leonardo VAIO
 */
public class Galinha {
    public static int ovosDaGranja; // variável global
    public int ovos; // total de ovos do objeto galinha
    
    public Galinha botar(){
        this.ovos++;
        Galinha.ovosDaGranja++;
        return this;
    }
    
    public static double madiaDeOvos(int galinhas){
        return Galinha.ovosDaGranja / galinhas;
    }
}
