package Aula_054_Exception_multi_catch__stacktrace_e_throws;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Leonardo VAIO
 */
public class DividePorZero {

    public static void dividir(Scanner s)throws InputMismatchException, ArithmeticException{
        System.out.print("Numero: ");
            int a = s.nextInt();

            System.out.print("Divisor: ");
            int b = s.nextInt();
            
            System.out.println(a / b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean continua = true;
        
        do{
            try{
                dividir(s);
            continua = false;
        }catch(InputMismatchException | ArithmeticException e1){
            System.err.println("Numeros Invalido");
           // e1.printStackTrace(); 
           // e1.getStackTrace(); 
            e1.getMessage();
            s.nextLine(); // descarta a entrada errada e libera novamente para o usuario
        }finally{
                System.out.println("Finally Executado");
            }
        }while (continua) ;
        
        
    }
    
}
