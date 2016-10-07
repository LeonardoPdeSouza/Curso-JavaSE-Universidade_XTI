package Logica_de_Programacao; 

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_010_Wrapper_Classes_Envolucros_de_Tipos_Primitivos {

    public static void main(String[] args) {
        Double preco = new Double("12.45");
        double b = preco.doubleValue();
        int i = preco.intValue();
        //byte b = preco.byteValue();
        Boolean casado = new Boolean(false);
        
        // CONVERSÃƒO ESTÃ�TICA
        double d1 = Double.parseDouble("123.45");
        int i1 = Integer.parseInt("123");
        float f1 = Float.parseFloat("3.14F");
        
        int i2 = Integer.valueOf("101011", 2);
        System.out.println("I2: " + i2); // 43 binario
      
    }
    
}
