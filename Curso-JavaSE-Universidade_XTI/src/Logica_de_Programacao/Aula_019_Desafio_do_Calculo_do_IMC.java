/*
 * Calcular o IMC
 * IMC = pesoEmQuilograma / (alturaEmMetros * AlturaEmMetros)
 */

package Logica_de_Programacao; 

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo VAIO
 */
public class Aula_019_Desafio_do_Calculo_do_IMC {

    
    public static void main(String[] args) {
        String peso = JOptionPane.showInputDialog("Qual seu Peso em Quilogramas? ");
        String altura = JOptionPane.showInputDialog("Qual seu Altura em Metros? ");
        double pesoEmQuilograma = Double.parseDouble(peso);
        double alturaEmMetros = Double.parseDouble(altura);
        double imc = pesoEmQuilograma / (alturaEmMetros * alturaEmMetros);
        
        String msg =(imc >= 20 && imc <=25) ? "Peso Ideal" : "Fora do Peso Ideal";
        msg = "IMC: " + imc + "\n" + msg;
        
        JOptionPane.showMessageDialog(null, msg);
        
        
    }
    
}
