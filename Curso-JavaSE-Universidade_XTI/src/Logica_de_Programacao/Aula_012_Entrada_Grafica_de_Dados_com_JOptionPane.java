package Logica_de_Programacao; 

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_012_Entrada_Grafica_de_Dados_com_JOptionPane {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu Nome? ");
        JOptionPane.showMessageDialog(null, nome);
        //System.out.println(nome);
    }
    
}
