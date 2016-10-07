package Logica_de_Programacao; 

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_024_switch {

    public static void main(String[] args) {
        String tecnologia = "Java";
        switch(tecnologia){
            case "Java":
            case "C++":
            case "Cobol":
                System.out.println("Linguagem de Programação");
                break;
            case "Oracle":
            case "sqlserver":
            case "postgresql":
                System.out.println("Banco de Dados");
                break;
                default:
                    System.out.println("Tecnologia Desconhecida");
        }
    }
    
}
