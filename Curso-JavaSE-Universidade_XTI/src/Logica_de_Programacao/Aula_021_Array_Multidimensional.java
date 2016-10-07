package Logica_de_Programacao; 

import java.util.Random;

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_021_Array_Multidimensional {

    public static void main(String[] args) {
        
        String[] faces = {"A","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
        String[] nipes = {"Espada","Paus","Copas","Ouros"};
        
        Random r = new Random();
        
       // int indiceFace = r.nextInt(faces.length);
        String face = faces[r.nextInt(faces.length)];
        
       // int indiceNipe = r.nextInt(nipes.length);
        String nipe = nipes[r.nextInt(nipes.length)];
        
        String carta = face + " " + nipe;
        System.out.println(carta);
//        String[] uma = {"Leonardo", "Leandro"};
//        
//        String[][] duas = {{"Leonardo", "M", "RS"},{"Leandro", "M", "RS"}};
//        
//        duas[1][0] = "Dinaira";
//        System.out.println(duas[1][0]);
    }
    
}
