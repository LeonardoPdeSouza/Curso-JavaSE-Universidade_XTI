/* MODIFICADORES
        (?i), Ignora maiúscula e Minúscula
        (?x), Comentários
        (?m), Multilinhas
        (?s), Dottal
*/

/* METACARACTERES
.  Qualquer caracter
\d Dígitos        [0-9]
\D Não é Digito   [^0-9]
\s Espaços        [ \t\n\0B\f\r]
\S Não é Espaço   [^\s]
\w Letra          [a-zA-Z_0-9]
\W Não é Letra
*/

/* QUANTIFICADORES
x{n}      X, exatamente n vezes
x{n, }    X, pelo menos n vezes
x{n, m}   X, pelo menos n vezes não mais do que m vezes
x?        X, 0 ou 1 vez
x*        X, 0 ou + vezes
x+        X, 1 ou + vezes
*/

/* METACARACTERES DE FRONTEIRA
^    inicia
$    finaliza
|    ou
*/

/* AGRUPADORES
[...]              Agrupamento
[a-z]              Alcence
[a-e][i-u]         União
[a-z&&[aeiou]]     Interseção
[^abc]             Exceção
[a-z&&[^m-p]]      Subtração
\z                 Fuga literal
*/


package Aula_061_Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Leonardo VAIO
 */
public class ExpressaoRegular {

    public static void main(String[] args) {
        
        boolean a = "java".matches("Java");
        boolean b = "java".matches("(?im)java");
        
        boolean c = "@".matches(".");
        boolean d = "2".matches("\\d");
        boolean e = "#".matches("\\w");
        boolean f = "".matches("\\s");
        boolean g = "@L".matches("..");
        boolean h = "21".matches("\\d\\d");
        String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        boolean i = "70294-070".matches(cep);
        boolean j = "21".matches("\\d{2}");
        boolean k = "123".matches("\\d{2,}");
        boolean l = "12345".matches("\\d{2,5}");
        boolean m = "".matches(".?"); // 0 ou 1
        boolean n = "12345".matches(".*"); // 0 ou +
        boolean o = "12345".matches(".+"); // 1 ou +
        boolean p = "70294-070".matches("\\d{5}-\\d{3}");
        boolean q = "10/10/1994".matches("\\d{2}/\\d{2}/\\d{4}");
        boolean r = "Pier21".matches("Pier.*");
        boolean s = "Pier21".matches(".*21$");
        boolean t = "Tem Java aqui".matches(".*Java.*");
        boolean u = "Tem Java aqui".matches("^Tem.*aqui$");
        boolean v = "sim".matches("sim|não");
        boolean x = "x".matches("[a-z]");
        boolean w = "3".matches("[0-9]");
        boolean y = "true".matches("[tT]rue"); // true True 
        boolean z = "true".matches("[tT]rue|[yY]es"); // true True | yes Yes
        boolean A = "Leonardo".matches("[A-Z][a-z]*"); // Primeiro Nome
        boolean B = "olho".matches("[^abc]lho");
        boolean C = "crau".matches("cr[ae]u");  // crau creu
        boolean D = "leonardo@gmail.com".matches("\\w+@\\w+\\.\\w{2,3}");  // Varificação de email
        boolean E = "leonardo.p.souza1994@gmail.com".matches(".*@\\w+\\.\\w{2,3}$");  // Varificação de email se no final tem @ .com ou .br
//        System.out.println(E);
        String doce = "Qual é o Doce mais doCe que o doce";
        Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
        
        /* SUBSTITUIÇÕES */
        String F = doce.replaceAll("(?i)doce", "Docinho");
        String rato = "O rato roeu a roupa do rei de roma";
        String G = rato.replaceAll("r[aeiou]", "XX");
        String H = "Tabular este texto".replaceAll("\\s", "\t");
        
        String url = "www.xti.com.br/Clientes-2011.html";
                   //http://xti.com.br/2011/Cliente.jsp 
        
        String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
        boolean I = url.matches(re);
        System.out.println(I);
        re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
        
        String J = url.replaceAll(re, "http://$1/$3/$2.jsp");
        System.out.println(J);
        System.out.println(url);
        
        
    }
    
}
