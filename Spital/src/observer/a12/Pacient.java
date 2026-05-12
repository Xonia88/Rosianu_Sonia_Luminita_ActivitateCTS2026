package observer.a12;

public class Pacient implements Observer {
    private String nume;
    public Pacient(String nume){
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume + "a primit notificare: " + mesaj);
    }
}
