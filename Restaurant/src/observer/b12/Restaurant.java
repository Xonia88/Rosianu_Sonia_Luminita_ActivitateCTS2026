package observer.b12;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<Observer> clienti = new ArrayList<>();

    public void adaugaClient(Observer o){
        clienti.add(o);
    }

    public void stergeClient(Observer o){
        clienti.remove(o);
    }

    public void notificaClient(String mesaj){
        for(Observer o : clienti){
            o.primesteNotificare(mesaj);
        }
    }
}
