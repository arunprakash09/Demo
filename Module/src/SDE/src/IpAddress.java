import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddress {
public static void main(String[] args) throws UnknownHostException {
InetAddress myIP= InetAddress.getLocalHost();

System.out.println(myIP.getLocalHost());
}
}