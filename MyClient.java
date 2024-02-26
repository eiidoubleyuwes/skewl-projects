//This script is supposed to connect to a server
import java.io.*;
import java.net.*;

public class MyClient {

  public static void main(String[] args) throws IOException {

    Socket socket = null;
    DataOutputStream outputStream = null;

    try {
      socket = new Socket("localhost", 6666);
      outputStream = new DataOutputStream(socket.getOutputStream());
      //Writes a string to the output stream
      outputStream.writeUTF("Hello Server");

    } catch(IOException e) {
      e.printStackTrace();
    } //Esures the socket and stream are closed properly even if an exception occurs
      // using close() method. This is important to avoid resource leaks.
    finally {
      if(outputStream != null) {
        try {
            outputStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
      }
      if(socket != null) {
        socket.close();
      }
    }
  }
}