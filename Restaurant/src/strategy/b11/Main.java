package strategy.b11;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();

        client.setModPlata(new PlataCash());
        client.plateste(150);

        client.setModPlata(new PlataCard());
        client.plateste(230);
    }
}