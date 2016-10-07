package Logica_de_Programacao; 

import java.util.Scanner;

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_018_Operadores_Especiais {

    
    public static void main(String[] args) {
//        int idade = 19;
//        String x = (idade >= 18) ? "Maior de Idade" : "Menor de Idade";
//        System.out.println(x);
        
        Scanner s = new Scanner(System.in);
        //DiÃ¢metro : 2r
        System.out.println("Informe o Raio: ");
        double raio = s.nextDouble();
        double diametro = 2 * raio;
        
        System.out.println("DiÃ¢metro: " + diametro);
        
        //CircunferÃªncia : 2 PI r
        double pi = Math.PI;
        double circunferencia = 2 * pi * raio;
        System.out.println("CircunferÃªncia: " + circunferencia);
        
        //Ã�rea PI r2
        double area = pi * (raio * raio);
        System.out.println("Ã�rea: " + area);
    }
    
}
