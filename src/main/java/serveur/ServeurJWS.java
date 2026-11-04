package serveur;
import jakarta.xml.ws.Endpoint;
import service.Calculatrice;
public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8686/";
        Endpoint.publish(url, new Calculatrice());
        System.out.println("service SOAP publie a : "+url);
    }

}
