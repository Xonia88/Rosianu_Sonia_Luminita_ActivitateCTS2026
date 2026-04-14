package prototype.b4;

public class Main {
    public static void main(String[] args) {

        Client client1 = new ClientConcret("Ion", "0712345678");

        Client client2 = client1.copiaza();
        Client client3 = client1.copiaza();

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
    }
}