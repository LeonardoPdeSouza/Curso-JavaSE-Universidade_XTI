package Logica_de_Programacao; 

import java.util.ArrayList;

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_022_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Branco");
        cores.add("Preto");
        cores.add(0,"Azul");
        cores.add("Vermelho");
        System.out.println(cores.toString());
        System.out.println("Tamanho: "+cores.size());
        System.out.println("Elemento 2: "+cores.get(2));
        System.out.println("Indece Branco: "+cores.indexOf("Branco"));
        
        cores.remove("Vermelho");
        System.out.println("Tem Amarelo: " + cores.contains("AmareloS"));
        
    }
    
}
