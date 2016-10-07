package Aula_055_Exception__Hierarquia_das_Classes;

/**
 *
 * @author Leonardo VAIO
 */
public class SenhaTest {
    static void autenticar(String senha) throws SenhaInvalidaException{
        if("123".equals(senha)){
            System.out.println("Autenticado");
        }else{
    throw new SenhaInvalidaException("Senha Incorreta");
}
    }
    
    public static void main(String[] args){
    try{
        autenticar("12345678910");
    }catch(SenhaInvalidaException e){
        //e.printStackTrace();
        System.out.println(e.getMessage());
    }
    }   
}
