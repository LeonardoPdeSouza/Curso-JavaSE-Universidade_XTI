package Aula_038_Desafio_Raiz_Quadra_com_Equacao_Pell;

/**
 *
 * @author Leonardo VAIO
 */
public class MatematicaTest {

    public static void main(String[] args) {
        Matematica m = new Matematica();
        m.raiz(27);
        System.out.println("================");
        
        int raiz = m.raiz2(27);
        System.out.println(raiz);
        System.out.println("================");
        System.out.println(Math.sqrt(27));
    }
    
}
