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
public class Arquivo3_maneira2 {

    private Path path = Paths.get("D:/Arquivo/contasManeira2.txt");
    private Charset utf8 = StandardCharsets.UTF_8;

    public void armazenarContas(ArrayList<ContaManeira2> contas) throws IOException {
        /* ESCRITA */
        try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
            for (ContaManeira2 conta : contas) {
                w.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");
            }
        }
    }
        

    public ArrayList<ContaManeira2> recuperarContas() throws IOException {
        /* LEITURA */
        ArrayList<ContaManeira2> contas = new ArrayList();
        try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
            String line = null;
            while((line = reader.readLine()) != null){
                String[] t = line.split(";");
                ContaManeira2 conta = new ContaManeira2(t[0],Double.parseDouble(t[1]));
                contas.add(conta);
            }
        } return contas;
    }
    

    public static void main(String[] args) throws IOException {
        /*
        ArrayList<ContaManeira2> contas = new ArrayList<>();
        contas.add(new ContaManeira2("Leonardo", 8001));
        contas.add(new ContaManeira2("André", 7001));
        contas.add(new ContaManeira2("Jarbas", 6001));
        contas.add(new ContaManeira2("Leandro", 5001));
*/
        Arquivo3_maneira2 operacao = new Arquivo3_maneira2();
       // operacao.armazenarContas(contas);
        ArrayList<ContaManeira2> contas2 = operacao.recuperarContas();
        for(ContaManeira2 conta : contas2){
            conta.exibeSaldo();
        }
    }

}
