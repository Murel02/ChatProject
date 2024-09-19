import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    private int port;

    public ChatServer(int port) {
        this.port = port;
    }

    public void start(){
        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Server is listening on port " + port);

            Socket socket = serverSocket.accept();
            System.out.println("New client connected.");

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write();


        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String broardcastMessage(String message){
        return null;
    }

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer(5000);
        chatServer.start();
    }
}
