package Logica_de_Programacao; 

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_028_while__do_while {

    public static void main(String[] args) {
        
        ArrayList<String> produtos = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        System.out.println("Liste seus Produtos : Para sair digite FIM");
        String produto;
        
        while(!"FIM".equals(produto = s.nextLine())){
         produtos.add(produto);
        }
        System.out.println(produtos.toString());
//        int i = 3;
//        do{
//            System.out.println(i);
//        }while(i < 2);
        
    
//        while (i <2){
//            System.out.println(i);
//            i++;
//        }
        
    }
    
}
