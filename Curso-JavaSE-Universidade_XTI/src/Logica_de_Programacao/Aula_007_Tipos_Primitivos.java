
package Logica_de_Programacao; 
/**
 *
 * @author Leonardo VAIO
 */
public class Aula_007_Tipos_Primitivos {

    public static void main(String[] args) {
        
        int idade = 19;
        double preco = 12.45;
        char sexo = 'M'; // Unicode
        boolean casado = true;
        
        byte b = 127; //cem
        short s = 32767; // 32mil
        int i = 2_000_000_000; // 2 bilhões
        long l = 9_000_000_000_000_000_000L; // 9 Quitilhões
        double d = 1.7976931348623157E+308; // IEEE 754
        float f = 123F;
        
        i = s; // Cast Implícito
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        
        System.out.println("");
        i = (int) l; // Cast Explícito
        System.out.println("long: " + l);
        System.out.println("int: " + i);
        
        byte bb = 0b01010101; // 8 bits  / 1 byte
        short ss = 0b0101010101010101; // 16 bits / 2 byte
        int ii = 0b01010101010101010101010101010101; // 32 bits / 4 bytes
        
        
        //System.out.println("Int: " + ii);
    }
    
}
