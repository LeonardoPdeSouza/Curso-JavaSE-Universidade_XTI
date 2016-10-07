package Logica_de_Programacao; 

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_031_AutoBoxing {

    public static void main(String[] args) {
//        Integer x = new Integer(555); // empacotado
//        int a = x.intValue(); // desempacotar 
//        a++; // incrementa
//        x= new Integer(a); //re-empacotar
//        System.out.println(x.intValue()); 
        
        Integer x = 555;
        x++; //desempacota, incrementa, reempacota
        System.out.println(x);
        
//        Boolean v = new Boolean("true");
//        if(v.booleanValue()){
//            System.out.println(v);
//        }
        
        Boolean v = new Boolean("true");
        if(v){
            System.out.println(v);
        }
    }
    
}
