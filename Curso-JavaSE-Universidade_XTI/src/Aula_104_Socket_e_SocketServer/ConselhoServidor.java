package Aula_104_Socket_e_SocketServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Leonardo VAIO
 */
public class ConselhoServidor {

    public static void main(String[] args) throws IOException {
        
        // 5000 é a porta por onde vai receber as requisições
        ServerSocket server = new ServerSocket(5000);
        
        
        while(true){
            // fica aguardando uma chegada de novos clientes e retorna um socket para poder conversar com o cliente
            Socket socket = server.accept();
            
            /**
             * socket.getOutputStream()  = escreve uma resposta pro usuario
             * PrintWriter = permite que imprima a mensagem
             */
           try (PrintWriter w = new PrintWriter(socket.getOutputStream())){
            w.println("Conectado");
           }
        }
    }
    
}
