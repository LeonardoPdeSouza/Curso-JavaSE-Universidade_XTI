package Aula_055_Exception__Hierarquia_das_Classes;

/**
 *
 * @author Leonardo VAIO
 */
public class SenhaInvalidaException  extends Exception{
    public SenhaInvalidaException(String mensagem){
        super(mensagem);
    }
}
