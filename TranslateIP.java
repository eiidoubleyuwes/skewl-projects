import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TranslateIP {
    public static void main(String[] args) {
        try {
            //Allow user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the domain name: ");
            String hostname =  scanner.nextLine();
            InetAddress addr = InetAddress.getByName(hostname);

            System.out.println("IP address for " + hostname + " is: " + addr.getHostAddress());

            System.out.println("Hostname (if available): " + addr.getHostName());
        } catch (UnknownHostException e) {
            String hostname = "";
            System.err.println("Error: Unable to resolve host: " + hostname + ". " + e.getMessage());
        }
    }
}
