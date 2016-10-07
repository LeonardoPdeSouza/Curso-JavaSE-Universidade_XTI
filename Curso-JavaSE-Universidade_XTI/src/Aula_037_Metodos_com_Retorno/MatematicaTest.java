package Aula_037_Metodos_com_Retorno;

/**
 *
 * @author Leonardo VAIO
 */
public class MatematicaTest {

    public static void main(String[] args) {
        Matematica m = new Matematica();
//        int par = m.maior(2, 4);
//        int impar = m.maior(3, 5);
        double so = m.soma(m.maior(2, 4), m.maior(3, 5));
        System.out.println(so);
//        int ma = m.maior(10, 20);
//        System.out.println(ma);
//        double so = m.soma(10,20);
//        System.out.println(so);
    }
    
}
