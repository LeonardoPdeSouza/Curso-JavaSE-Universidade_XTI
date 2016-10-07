package Logica_de_Programacao; 

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_030_Label__Break_e_Continue {

    public static void main(String[] args) {
        
        boolean[][] matrix ={
            {false, true, false, false, false},
            {false, false, false, false, false}
        };
        busca:
        for(int a=0; a < matrix.length; a++){
            System.out.print("A ");
            for(int b=0; b < matrix[a].length; b++){
                if(matrix[a][b]){
                    System.out.print("TRUE ");
                    break busca;
                }
            System.out.print("B ");
        }
        }
        
//        for(int i = 0; i<10; i++){
//            if(i == 5){
//                continue; // interação atual
//            }
//            System.out.println(i);
//        }
        
//        for(int i = 0; i<10; i++){
//            if(i == 5){
//                break;
//            }
//            System.out.println(i);
//        }
    }
    
}
