import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GetIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the domain name: ");
        String domainName = scanner.nextLine();

        try {
            InetAddress address = InetAddress.getByName(domainName);
            System.out.println("The IP address for " + domainName + " is: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Error: Unable to resolve the IP address for " + domainName + ": " + e.getMessage());
        }
    }
}
