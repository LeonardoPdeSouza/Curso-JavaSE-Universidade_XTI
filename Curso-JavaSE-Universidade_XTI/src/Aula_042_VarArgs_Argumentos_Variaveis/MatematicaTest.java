package Aula_042_VarArgs_Argumentos_Variaveis;

/**
 *
 * @author Leonardo VAIO
 */
public class MatematicaTest {

    public static void main(String[] args) {
        Matematica m = new Matematica();

        //double[] = numeros = {2, 3,4,5,67,8,95,65};
        double total = m.soma("Titulo: ", 2, 3, 4, 5, 67, 8, 95, 65);
        System.out.println("Total: " + total);
    }

}
