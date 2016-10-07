package Logica_de_Programacao; 

import java.util.Arrays;

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_020_Array {

    public static void main(String[] args) {
        String[]paises = {"Brasil", "Russia", "India", "China"};
        System.out.println(paises[0]);
//      paises[0] = "BRAZIL";
        System.out.println(paises[0]);
        System.out.println(paises.length); //comprimento
        System.out.println(Arrays.toString(paises));
        int posicao = Arrays.binarySearch(paises, "Rússia");
        System.out.println(posicao);
        
        Arrays.sort(paises,0, paises.length);
        System.out.println(Arrays.toString(paises));
        
        Double[] valores = {12.35,3456.3456};
        System.out.println(valores[0].doubleValue());
//        int[] impares = new int[5];
//        impares[0] = 1;
//        impares[1] = 3;
//        impares[2] = 5;
//        impares[3] = 7;
//        impares[4] = 9;
        
        
    }
    
}
