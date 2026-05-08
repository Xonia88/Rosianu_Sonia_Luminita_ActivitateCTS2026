package flyweight.b10;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Client> clienti = new HashMap<>();

    public Client getClient(String nume, String telefon) {

        if (!clienti.containsKey(nume)) {
            clienti.put(nume, new Client(nume, telefon));
        }

        return clienti.get(nume);
    }
}