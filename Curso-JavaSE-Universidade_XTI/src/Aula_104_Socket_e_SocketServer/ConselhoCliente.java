package Aula_104_Socket_e_SocketServer;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Leonardo VAIO
 */
public class ConselhoCliente {

    public static void main(String[] args) throws IOException {
        
//instanciar o socket passando o endereço IPv4 e um número da porta obs: 0 a 1023 estão já utilizadas
        Socket socket = new Socket("192.168.56.1",5000); 
        
        // socket.getInputStream() = Recupera as mensagens recebidas la da classe ConselhoServidor
        Scanner entrada = new Scanner(socket.getInputStream());
        
        // mostra toda vez que receber uma msg
        System.out.println("Mensagem: "+ entrada.nextLine());
        
        // fecha
        entrada.close();
    }
    
}
