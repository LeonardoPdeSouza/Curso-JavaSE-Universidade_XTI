package Aula_068_Serializacao_de_Contas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import Aula_064_Desafio_IO_Armazenar_Contas_em_Arquivo_Sequencial.Arquivo3_maneira2;
import Aula_064_Desafio_IO_Armazenar_Contas_em_Arquivo_Sequencial.ContaManeira2;

/**
 *
 * @author Leonardo VAIO
 */
public class Arquivo3 {
	
    public void armazenarContas(ArrayList<Conta> contas) throws IOException {
        /* ESCRITA */
        try (FileOutputStream fos = new FileOutputStream("src/Aula_068_Serializacao_de_Contas/Contas.ser")) {
        	try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
        		oos.writeObject(contas);
        		oos.close();
            }
        }
    }
        

    public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException {
        /* LEITURA */
        ArrayList<Conta> contas = new ArrayList();
        try(FileInputStream fis = new FileInputStream("src/Aula_068_Serializacao_de_Contas/Contas.ser")){
            try(ObjectInputStream ois = new ObjectInputStream(fis)){
            	return (ArrayList<Conta>) ois.readObject();
            }
        } 
    }
    

    public static void main(String[] args) throws Exception {
        
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Leonardo", 8001));
        contas.add(new Conta("André", 7001));
        contas.add(new Conta("Jarbas", 6001));
        contas.add(new Conta("Leandro", 5001));

        Arquivo3 operacao = new Arquivo3();
        operacao.armazenarContas(contas);
        ArrayList<Conta> contas2 = operacao.recuperarContas();
        for(Conta conta : contas2){
            conta.exibeSaldo();
        }
    }

}


