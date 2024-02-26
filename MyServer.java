import java.io.*;  
import java.net.*;  
public class MyServer {  
public static void main(String[] args){  
    // Add try-with-resources to automatically close the resources
    // Creates a ServerSocket bound to port 6666 to listen for client connections.
    try (ServerSocket serverSocket = new ServerSocket(6666);
            Socket clientSocket = serverSocket.accept(); // Waits and accepts a connection from a client, returning a
                                                         // Socket.
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());) {

        String message = in.readUTF();

        // Add input validation to check for empty message
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("Empty message"); 
        }

        System.out.println("Message received: " + message);

    } catch (IOException e) {
        e.printStackTrace(); // Print the exception for easier debugging
    }  
}  
} 
