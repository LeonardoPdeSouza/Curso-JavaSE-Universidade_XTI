package Logica_de_Programacao; 

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_023_if_else {

    public static void main(String[] args) {
        
        int nota = 6;
        if(nota >= 7){
            System.out.println("Passou");
        }else{
            System.out.println("Reprovado");
            
            if(nota>=6){
                System.out.println("Mais pode fazer a recuperação");
            }
        }
        
//        int idade = 16;
//        if(idade <= 11){
//            System.out.println("Criança");
//        } else if (idade > 11 && idade <= 18){
//            System.out.println("Adolescente");
//        } else if (idade > 18 && idade <= 60){
//            System.out.println("Adulto");
//        } else{
//            System.out.println("Melhor Idade");
//        }
        
//        int numero = 16;
//        if((numero % 2) == 0){
//            System.out.println("Par");
//        }else{
//            System.out.println("Impar");
//        }
        
//        boolean passou = true;
//        if(passou){ // boolean valor padrão true
//            System.out.println("Contratou");
//        }
        
//        int idade = 10;
//        if(idade < 11){
//            System.out.println("Criança");
//        }
    }
    
}
