package observer.a12;


import java.util.ArrayList;
import java.util.List;

public class Spital {
    private List<Observer> pacienti = new ArrayList<>();

    public void adaugaPacient(Observer o) {

        pacienti.add(o);
    }

    public void stergePacient(Observer o) {
        pacienti.remove(o);
    }

    public void notificaPacienti(String mesaj) {
        for(Observer o : pacienti) {
            o.primesteNotificare(mesaj);
        }
    }

}
