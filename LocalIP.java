import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalIP {
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            System.out.println("Local HostAddress: " + addr.getHostAddress());
            System.out.println("Local Host Name: " + addr.getHostName());
        } catch (UnknownHostException e) {
            // Using system.err for better error handling
            System.err.println("Error getting local host information: " + e.getMessage());
        }
    }
}
