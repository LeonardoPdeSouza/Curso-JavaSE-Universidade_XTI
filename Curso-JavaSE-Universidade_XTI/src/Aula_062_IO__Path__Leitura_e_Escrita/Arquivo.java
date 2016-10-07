package Aula_062_IO__Path__Leitura_e_Escrita;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Leonardo VAIO
 */
public class Arquivo {

    public static void main(String[] args) throws IOException {
        
        //Java
        Path path = Paths.get("D:/Arquivo/texto.txt");
        System.out.println(path.toAbsolutePath()); // caminho absoluto
        System.out.println(path.getParent()); // caminho do Pai
        System.out.println(path.getRoot()); // Raiz do Sistema
        System.out.println(path.getFileName()); // Nome do Arquivo
        
        /* CRIAÇÃO DE DIRETÓRIOS */
        
        Files.createDirectories(path.getParent());
        
        /* ESCREVER E LER ARQUIVOS */
        byte[] bytes = "Meu Texto".getBytes();
        Files.write(path, bytes); // Write Cria caso ele não exista,abre o arquivo, limpa e escreve no arquivo fecha o arquivo
    
        byte[] retorno = Files.readAllBytes(path);
        System.out.println(new String(retorno));
    
    }
    
}
