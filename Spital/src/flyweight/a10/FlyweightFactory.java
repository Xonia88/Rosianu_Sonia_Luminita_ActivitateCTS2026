package flyweight.a10;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Pacient> pacienti = new HashMap<>();

    public Pacient getPacient(String nume, int varsta) {

        if (!pacienti.containsKey(nume)) {
            pacienti.put(nume, new Pacient(nume, varsta));
        }

        return pacienti.get(nume);
    }
}