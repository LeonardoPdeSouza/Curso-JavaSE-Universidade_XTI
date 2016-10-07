package Aula_058_String__Principais_Operacoes;

/**
 *
 * @author Leonardo VAIO
 */
public class StringOperacoes {

    public static void main(String[] args) {
        
        String s1 = "Write Once";
        String s2 = s1 + " Run AnyWhere";
        String s3 = new String("Java Virtual Machine");
        
        char[] array = {'J','A','V','A'};
        String s4 = new String(array);
        
        // OPERAÇÕES
        
        int tamanho = s1.length();
        char letra = s1.charAt(0); // 0 a length()-1
        String texto = s1.toString();
        
        // LOCALIZAÇÃO
        
        int posisao = s3.indexOf("Virtual");
        int ultima = s3.lastIndexOf('a');
        boolean vazia = s3.isEmpty();
        //System.out.println(posisao);
        
        // COMPARAÇÃO
        
        String xti = "XTI";
        boolean a = xti.equals("xti");
        boolean b = xti.equalsIgnoreCase("xti"); 
        boolean c = xti.startsWith("TI"); // Inicia
        boolean d = xti.endsWith("TI"); // Termina
        
        int e = "Amor".compareTo("Bola"); //-1
        int f = "Bola".compareTo("Amor"); //1
        int g = "Amor".compareTo("Amor"); //1
        
        String so = "Olhe, olhe!";
        boolean h = so.regionMatches(true,6, "Olhe", 0, 4);
        
        
        String text = "O Brasil é Lindo";
        String i = text.substring(11);// Apartir da posisão
        String j = text.substring(2, 8); // index de inicio ate o index de final
        String k = text.concat(" que Maravilha"); //concatena
        String l = text.replace('s','z'); // substitui
        String m = text.replaceFirst(" ","X");
        String n = text.replaceAll(" ","X");
        String o = text.toUpperCase();
        String p = text.toLowerCase();
        System.out.println("   Esp aço   ".trim());
        
        System.out.println(o);
    }
    
}
