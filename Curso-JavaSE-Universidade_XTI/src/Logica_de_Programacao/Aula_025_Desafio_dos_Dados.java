package Logica_de_Programacao; 

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_025_Desafio_dos_Dados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int palpite,dado;
        
        System.out.print("Palpite: ");
        palpite = entrada.nextInt();
        
        Random r = new Random();
        dado = r.nextInt(6)+1;
        System.out.println("=================================");
        if(dado == palpite){
            System.out.println("Palpite: " + palpite + "\nDado: " + dado);
            System.out.println("Parabéns Você Acertou");
        }else{
            System.out.println("Palpite: " + palpite + "\nDado: " + dado);
            System.out.println("Não Foi dessa vez");
        }
        System.out.println("=================================");
    }
    
}
