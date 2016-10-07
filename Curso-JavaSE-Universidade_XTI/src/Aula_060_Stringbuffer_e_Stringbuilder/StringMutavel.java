package Aula_060_Stringbuffer_e_Stringbuilder;

/**
 *
 * @author Leonardo VAIO
 */
public class StringMutavel {

    public static void main(String[] args) {
        
        StringBuffer s0 = new StringBuffer();
        StringBuilder s1 = new StringBuilder("Java");
        
        s1.toString();
        s1.length();
        //System.out.println(s1.length());
        s1.capacity();
        //System.out.println(s1.capacity());
        
       // System.out.println(s1);
        //System.out.println(s1.reverse());
        //s1.reverse();
        
        s1.append(" Trabalhando ");
        char[] c = {'c','o','m'};
        s1.append(c).append(" Textos.");
        System.out.println(s1);
        
        String s = "Oi" + " Como " + "Vai você?";
        String sb = new StringBuilder("Oi").append(" como ").append("Vai você?").toString();
        //System.out.println(sb);
        
        String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
        System.out.println(url);
    }
    
}
