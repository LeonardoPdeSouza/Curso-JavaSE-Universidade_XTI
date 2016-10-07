package Aula_065_IO_Check_Delete_Create_Copy_e_Move;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Leonardo VAIO
 */
public class Arquivo4 {

    public static void main(String[] args) throws IOException {
        
//        Path path = Paths.get("D:/Arquivo/texto.txt");
//        System.out.println("Caminho Existe? "+Files.exists(path)); 
//        System.out.println("Caminho é um diretorio? "+Files.isDirectory(path)); 
//        System.out.println("É um arquivo regular? "+Files.isRegularFile(path));
//        System.out.println("Pode ser lido pelo usuário? "+Files.isReadable(path));
//        System.out.println("Pode ser executado? "+Files.isExecutable(path));
//        System.out.println("Tamanho do arquivo: "+Files.size(path));
//        System.out.println("Ultima vez modificado: "+Files.getLastModifiedTime(path));
//        System.out.println("Autor: " +Files.getOwner(path));
//        System.out.println("Tipo de arquivo: " + Files.probeContentType(path));
//        
//        /* DELETE */
//        Files.delete(path); // deleta com exceções
//        Files.deleteIfExists(path); // deleta se o arquivo/diretorio existir 
        
        /* CREATE */
        Path path = Paths.get("D:/Arquivo/fonte.txt");
        Files.deleteIfExists(path);
        Files.createFile(path);
        Files.write(path, "Meu Texto".getBytes());
        
        /* COPY*/
        Path copia = Paths.get("D:/Arquivo/copia.txt");
        Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
        
        /* MOVE */
        Path mover = Paths.get("D:/Arquivo/move/fonte.txt");
        Files.createDirectories(mover.getParent());
        Files.move(path, mover, StandardCopyOption.REPLACE_EXISTING);
    }
    
}
