package observer.a12;

public class Main {
    public static void main(String[] args) {

        Spital spital = new Spital();
        Observer p1 = new Pacient("Gigel");
        Observer p2 = new Pacient("Andrei");
        Observer p3 = new Pacient("Daniel");
        Observer p4 = new Pacient("Daniel");

        spital.adaugaPacient(p1);
        spital.adaugaPacient(p2);
        spital.adaugaPacient(p3);
        spital.adaugaPacient(p4);

        spital.notificaPacienti("Pericol COVID");
    }
}
