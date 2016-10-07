package Logica_de_Programacao; 

import java.util.Scanner;

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_011_Entrada_de_Dados_com_Scanner {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual seu Nome? ");
        String nome = s.nextLine();
        System.out.println("Bem vindo " + nome);
    }
    
}
