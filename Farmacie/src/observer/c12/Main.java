package observer.c12;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie();

        Observer c1 = new Client("Ion");
        Observer c2 = new Client("Andreea");
        Observer c3 = new Client("Ioana");

        farmacie.adaugaClient(c1);
        farmacie.adaugaClient(c2);
        farmacie.adaugaClient(c3);

        farmacie.notificaClienti("Reducere la toate produsele");
    }
}
