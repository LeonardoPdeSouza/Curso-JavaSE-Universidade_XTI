package Aula_059_String__split__Tokens_e_Delimitadores;

/**
 *
 * @author Leonardo VAIO
 */
public class StringToken {

    public static void main(String[] args) {
        String s = "HTML; CSS; JavaScript; jQuery; Java";
        s = "Venha trabalhar na XTI";
        String[] tokens = s.split(" ");
        System.out.println(tokens.length + " Tokens");
        for(String token : tokens){
            System.out.println(token);
        }
    }
    
}
