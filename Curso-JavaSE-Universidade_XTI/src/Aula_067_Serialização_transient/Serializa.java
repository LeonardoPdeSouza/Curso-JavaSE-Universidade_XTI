package Aula_067_Serialização_transient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Serializa {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String[] nomes = {"Leonardo", "Luciele", "Pyttoko"};
		Conta conta1 = new Conta("Leonardo", 8001);
		Conta conta2 = new Conta("Luciele", 1004);
		
		// Escrita de Objetos
		FileOutputStream fos = new FileOutputStream("src/Aula_067_Serialização_transient/Objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(nomes);
		oos.writeObject(conta1);
		oos.writeObject(conta2);
		oos.close();
		
		// Leitura de Objetos
		FileInputStream fis = new FileInputStream("src/Aula_067_Serialização_transient/Objeto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		String[] nomes1 = (String[]) ois.readObject();
		Conta c1 = (Conta) ois.readObject();
		Conta c2 = (Conta) ois.readObject();
		ois.close();
		
		c1.exibeSaldo();
		c2.exibeSaldo();
		
		System.out.println(Arrays.toString(nomes1));
		
		
		

	}

}
