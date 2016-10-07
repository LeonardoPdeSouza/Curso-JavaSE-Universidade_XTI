package Aula_064_Desafio_IO_Armazenar_Contas_em_Arquivo_Sequencial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Leonardo VAIO
 */
public class Arquivo3 {

    public static void main(String[] args) {
        
        
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Leonardo", 8001));
        contas.add(new Conta("André", 7001));
        contas.add(new Conta("Jarbas", 6001));
        contas.add(new Conta("Leandro", 5001));
        
        Path path = Paths.get("D:/Arquivo/contas.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        
        
        /* ESCRITA */
        try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){
        w.write(contas.toString());
        }catch(IOException e){
            e.printStackTrace();
        
        }
        
        /* LEITURA */
        try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
                    e.printStackTrace();
                    }
    }
    
}
