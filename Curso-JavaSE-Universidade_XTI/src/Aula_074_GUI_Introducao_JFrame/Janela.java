package Aula_074_GUI_Introducao_JFrame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{
	
	public Janela(){
		super("Minha Janela"); // Titulo da janela
		
		JButton botao = new JButton("Clique"); // Cria botão com texto
		getContentPane().add(botao); // Conteiner para adicionar os componentes(controles)
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Operação do botão fechar
		setSize(300 , 300); // Dimensões da janela
		setVisible(true); // Deixa o JFrame visivel
		
	}

	public static void main(String[] args) {
		new Janela(); 
	}

}
